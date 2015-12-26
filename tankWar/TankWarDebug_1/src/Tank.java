import java.awt.event.*;
import java.awt.*;

public class Tank {

	private TankWar tc;

	private Direction ptDir = Direction.UP;

	public static final int SPEED = 5;

	public static final int WIDTH = 30;

	public static final int HEIGHT = 30;

	enum Direction {
		STOP, LEFT, LEFT_UP, UP, RIGHT_UP, RIGHT, RIGHT_DOWN, DOWN, LEFT_DOWN
	};

	private int x, y;

	private boolean bL, bU, bR, bD;

	private Direction dir = Direction.STOP;

	public Tank(TankWar tc, int x, int y) {
		this.x = x;
		this.y = y;
		this.tc = tc;
	}

	public void move() {
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
		case STOP:
			break;
		}
		if(this.dir != Direction.STOP)
		this.ptDir = this.dir;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		switch (key) {
		case KeyEvent.VK_LEFT:
			bL = true;
			break;
		case KeyEvent.VK_UP:
			bU = true;
			break;
		case KeyEvent.VK_RIGHT:
			bR = true;
			break;
		case KeyEvent.VK_DOWN:
			bD = true;
			break;
		}
		this.locateDirection();

	}

	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.pink);
		g.fillOval(x, y,WIDTH,HEIGHT);
		g.setColor(c);
		


		int cX = x + WIDTH / 2;
		int cY = y + HEIGHT / 2;
	
		switch (ptDir) {
		case LEFT:
			g.drawLine(cX, cY, x, y + HEIGHT / 2);
			break;
		case LEFT_UP:
			g.drawLine(cX, cY, x, y);
			break;
		case UP:
			g.drawLine(cX, cY, x + WIDTH / 2, y);
			break;
		case RIGHT_UP:
			g.drawLine(cX, cY, x + WIDTH, y);
			break;
		case RIGHT:
			g.drawLine(cX, cY, x + WIDTH, y + HEIGHT / 2);
			break;
		case RIGHT_DOWN:
			g.drawLine(cX, cY, x + WIDTH, y + HEIGHT);
			break;
		case DOWN:
			g.drawLine(cX, cY, x + WIDTH / 2, y + HEIGHT);
			break;
		case LEFT_DOWN:
			g.drawLine(cX, cY, x, y + HEIGHT);
		}

		move();
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		switch (key) {
		case KeyEvent.VK_LEFT:
			bL = false;
			break;
		case KeyEvent.VK_UP:
			bU = false;
			break;
		case KeyEvent.VK_RIGHT:
			bR = false;
			break;
		case KeyEvent.VK_DOWN:
			bD = false;
			break;
		case KeyEvent.VK_CONTROL :
			tc.missle.add(this.fire());
			break;
		}
		this.locateDirection();
	}

	private void locateDirection() {
		if (bL && !bU && !bR && !bD)
			dir = Direction.LEFT;
		if (bL && bU && !bR && !bD)
			dir = Direction.LEFT_UP;
		if (!bL && bU && !bR && !bD)
			dir = Direction.UP;
		if (!bL && bU && bR && !bD)
			dir = Direction.RIGHT_UP;
		if (!bL && !bU && bR && !bD)
			dir = Direction.RIGHT;
		if (!bL && !bU && bR && bD)
			dir = Direction.RIGHT_DOWN;
		if (!bL && !bU && !bR && bD)
			dir = Direction.DOWN;
		if (bL && !bU && !bR && bD)
			dir = Direction.LEFT_DOWN;
		if (!bL && !bU && !bR && !bD)
			dir = Direction.STOP;
	}

	public Missle fire() {
		int x = this.x + Tank.WIDTH/2 - Missle.WIDTH/2;
		int y = this.y + Tank.HEIGHT/2 - Missle.HEIGHT/2;
		Missle m = new Missle(x, y, ptDir, this.tc);
		tc.missle.add(m);
		return m;
	}
}
