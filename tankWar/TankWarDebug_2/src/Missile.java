import java.awt.*;

public class Missile {
	public static final int XSTEP=10;
	public static final int YSTEP=10;
	int x,y;
	public static final int WIDTH = 10;
    public static final int HEITH =10;
	Tank.Direction dir;
	TankClient tc;
	private boolean isLive = true;
	
	public Missile(int x, int y, Tank.Direction dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	
	public Missile(int x, int y ,Tank.Direction dir, TankClient tc){
		this(x,y,dir);
		this.tc=tc ;
		
	}
	
	public void draw(Graphics g){
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		g.fillOval(x, y, WIDTH,HEITH);
		g.setColor(c);
		move();
	}
	private void move() {
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
		if(x<0||y<0||x>TankClient.GAME_WIDTH||y>TankClient.GAME_HEITH){
			isLive= false;
			tc.Missiles.remove(this);
		}
	}

	public boolean isLive() {
		return isLive;
	}
}	


