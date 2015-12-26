import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class TankClient extends Frame {
	Image offScreenImage = null;
	public static final int GAME_WIDTH=800;
	public static final int GAME_HEITH=600;
	
	Tank MyTank = new Tank(50,50,this);
	List<Missile> Missiles = new ArrayList<Missile>();
		
	public void lunchFrame(){
		this.setBounds(100, 100, GAME_WIDTH,GAME_HEITH);
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.addKeyListener(new KeyMonitar());
		this.setTitle("坦克大战");
		this.setResizable(false);
		new Thread(new paintThread()).start();
		
		
	}
	
	public void paint(Graphics g){
		g.drawString("missiles count:" +Missiles.size(), 10, 50);
		for(int i = 0; i< Missiles.size();i++){
			Missiles.get(i).draw(g);
			
		}
		MyTank.draw(g);
		
	}
	
	//双缓冲技术
	public void update(Graphics g) {
		if (offScreenImage == null) {
			offScreenImage=this.createImage(GAME_WIDTH,GAME_HEITH);
		}
		Graphics goffscreen = offScreenImage.getGraphics();
		Color c = goffscreen.getColor();
		goffscreen.setColor(Color.DARK_GRAY);
		goffscreen.fillRect(0,0,GAME_WIDTH,GAME_HEITH);
		goffscreen.setColor(c);
		paint(goffscreen);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	//双缓冲技术		
	
	
	public class KeyMonitar extends KeyAdapter{
		public void keyReleased(KeyEvent e) {
			MyTank.keyReleased(e);
		}

		public void keyPressed(KeyEvent e) {
			MyTank.KeyPressed(e);		
		}
		
	}
	

	private class paintThread implements Runnable {

		public void run() {
			while(true){
				repaint();
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}

	public static void main(String[] args) {
		TankClient tc= new TankClient();
		 tc.lunchFrame();
	}
}
