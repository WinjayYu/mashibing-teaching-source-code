import java.awt.*;
import java.awt.Event.*;
import java.awt.event.KeyEvent;



public class Tank {
	private int x, y;
	public static final int WIDTH = 30;
	public static final int HEITH = 30;
	private static final int XSTEP=2;
	private static final int YSTEP=2;
	enum Direction{L,LU,U,RU,R,RD,D,LD,STOP};
	private boolean BL = false, BU = false, BR = false, BD =false;
	Direction dir =Direction.STOP;
	Direction ptDir = Direction.U;
	TankClient tc;
	
	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Tank(int x, int y,TankClient tc){
		this(x,y);
		this.tc = tc ;
	}
	
	
	public void draw(Graphics g){
		Color c =g.getColor();
		g.setColor(Color.RED);
		g.fillOval(x,y,WIDTH,HEITH);
		g.setColor(c);
		switch(ptDir){
		 case L:
			 g.drawLine(x+Tank.WIDTH/2,y+Tank.HEITH/2, x , y+Tank.HEITH/2);
			 break;
		 case LU:
			 g.drawLine(x+Tank.WIDTH/2,y+Tank.HEITH/2, x , y);
			 break;
		 case U:
			 g.drawLine(x+Tank.WIDTH/2,y+Tank.HEITH/2, Tank.WIDTH/2 + x , y);
			 break;
		 case RU:
			 g.drawLine(x+Tank.WIDTH/2,y+Tank.HEITH/2,Tank.WIDTH + x, y);
			 break;
		 case R:
			 g.drawLine(x+Tank.WIDTH/2,y+Tank.HEITH/2,x+Tank.WIDTH,Tank.HEITH/2+y);
			 break;
		 case RD:
			 g.drawLine(x+Tank.WIDTH/2,y+Tank.HEITH/2,x+Tank.WIDTH,Tank.HEITH+y);
			 break;
		 case D:
			 g.drawLine(x+Tank.WIDTH/2,y+Tank.HEITH/2,x+Tank.WIDTH/2,y+Tank.HEITH);
			 break;
		 case LD:
			 g.drawLine(x+Tank.WIDTH/2,y+Tank.HEITH/2,x,y+Tank.HEITH);
			 break;
		}
		move();
		
	}
	
	public void move(){
		switch(dir){
			 case L:
				 x-=XSTEP;
				 break;
			 case LU:
				 x-=XSTEP;
				 y-=YSTEP;
				 break;
			 case U:
				 y-=YSTEP;
				 break;
			 case RU:
				 x+=XSTEP;
				 y-=YSTEP;
				 break;
			 case R:
				 x+=YSTEP;
				 break;
			 case RD:
				 x+=XSTEP;
				 y+=YSTEP;
				 break;
			 case D:
				 y+=YSTEP;
				 break;
			 case LD:
				 x-=XSTEP;
				 y+=YSTEP;
				 break;
			 case STOP:
				 break;
		}
		if (dir!= Direction.STOP)
			this.ptDir=this.dir;
		
	}
	public void KeyPressed(KeyEvent e){
		int key = e.getKeyCode();
		switch(key){
			 case KeyEvent.VK_LEFT:
				 BL=true;
				  break;
			 case KeyEvent.VK_UP:
				 BU=true;
				 break;
			 case KeyEvent.VK_RIGHT:
				 BR=true;
				 break;
			 case KeyEvent.VK_DOWN:	 
				 BD=true;
				 break;
		}
		LocatDricetion();
		
	}
	public void LocatDricetion(){
		if (BL & !BU & !BR & !BD) dir = Direction.L;
		else if (BL & BU & !BR & !BD) dir = Direction.LU;
		else if (!BL & BU & !BR & !BD) dir = Direction.U;
		else if (!BL & BU & BR & !BD) dir = Direction.RU;
		else if (!BL & !BU & BR & !BD) dir =Direction.R;
		else if (!BL & !BU & BR & BD) dir = Direction.RD;
		else if (!BL & !BU & !BR & BD) dir = Direction.D;
		else if (BL & !BU & !BR & BD) dir = Direction.LD;
		else dir = Direction.STOP;
				
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key){
		  case KeyEvent.VK_CONTROL:
		 	  fire();
		 	  break;
		  case KeyEvent.VK_LEFT:
			 BL=false;
			 
			 break;
		  case KeyEvent.VK_UP:
		 	 BU=false;
			 break;
		  case KeyEvent.VK_RIGHT:
		 	 BR=false;
			 break;
		  case KeyEvent.VK_DOWN:	 
			 BD=false;
			 break;
		}
		LocatDricetion();
		
	}
	
	public Missile fire(){
		int x=this.x+ Tank.WIDTH/2 - Missile.WIDTH/2;
		int y=this.y + 	Tank.HEITH/2- Missile.HEITH/2;
 		Missile m = new Missile(x, y, ptDir, this.tc );
		tc.Missiles.add(m);
		return m;
	}

}
