import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	// int x
	int speed;

	Rocketship(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = 20;
	}

	public void update() {
		super.update();
	}

	public void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}

	public void right() {
		// TODO Auto-generated method stub
		x += speed;
	}public void left() {
		// TODO Auto-generated method stub
		x -= speed;
	}public void up() {
		// TODO Auto-generated method stub
		y -= speed;
	}public void down() {
		// TODO Auto-generated method stub
		y += speed;
	}
}
