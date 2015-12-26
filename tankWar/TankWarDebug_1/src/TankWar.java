import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class TankWar extends Frame {

	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 600;

	Tank MyTank = new Tank(this,50, 50);
	Image offScreenImage = null;
	
	List<Missle>missle = new ArrayList<Missle>();
	
	

	public void launch(){
		setLocation(111,111);
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setTitle("xuezhan");
		setResizable(false);
		setBackground(Color.lightGray);
		this.addKeyListener(new KeyMonitor());
		
		setVisible(true);
		new Thread(new PaintThread()).start();
		this.addWindowListener(new WindowAdapter(){

			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
		
	}
	
	public void update(Graphics g) {
		
		if (offScreenImage == null) {
			offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);
		}
		Graphics gOffScreen = offScreenImage.getGraphics();
		Color c = gOffScreen.getColor();
		gOffScreen.setColor(Color.blue);
		gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage, 0, 0, null);
	} 
	
	public static void main(String[] args) {

		TankWar tc = new TankWar();
		tc.launch();
	}

	public void paint(Graphics g) {
		g.drawString("missles count:"+missle.size(),10,50);
		
		
		
		for(int i = 0; i<missle.size();i++){
			Missle m = missle.get(i);
				m.draw(g);
		}
		MyTank.draw(g);
		
		

	}

	class PaintThread implements Runnable {
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(25);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

	class KeyMonitor extends KeyAdapter {

		public void keyPressed(KeyEvent e) {

			MyTank.keyPressed(e);
		}

		public void keyReleased(KeyEvent e) {

			MyTank.keyReleased(e);
		}
	}
}
