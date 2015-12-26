import java.awt.*;

public class Missle {
	public static final int WIDTH = 10;

	public static final int HEIGHT = 10;

	public static final int SPEED = 10;

	private boolean Live = true;

	Tank.Direction dir = Tank.Direction.RIGHT;

	private TankWar tc;

	int x, y;

	public Missle(int x, int y, Tank.Direction dir, TankWar tc) {
		this(x, y, dir);
		this.tc = tc;
	}

	public Missle(int x, int y, Tank.Direction dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

	public void draw(Graphics g) {

		Color c = g.getColor();
		g.setColor(Color.orange);
		g.fillOval(x, y, WIDTH, HEIGHT);
		g.setColor(c);
		move();
	}

	private void move() {
		switch (dir) {
		case LEFT:
			x -= SPEED;
			break;
		case LEFT_UP:
			x -= SPEED;
			y -= SPEED;
			break;
		case UP:
			y -= SPEED;
			break;
		case RIGHT_UP:
			x += SPEED;
			y -= SPEED;
			break;
		case RIGHT:
			x += SPEED;
			break;
		case RIGHT_DOWN:
			x += SPEED;
			y += SPEED;
			break;
		case DOWN:
			y += SPEED;
			break;
		case LEFT_DOWN:
			x -= SPEED;
			y += SPEED;
			break;

		}
		if (x < 0 || y < 0 || x > TankWar.GAME_WIDTH || y > TankWar.GAME_HEIGHT) {
			
			Live = false;
		
			tc.missle.remove(this);
		}
	}

	public boolean isLive() {
		return Live;
	}
}
