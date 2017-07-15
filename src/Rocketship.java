import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	// int x
	int speed;

	Rocketship(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = 5;
	}

	public void update() {

	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);

	}

	public void right() {
		// TODO Auto-generated method stub
		x += speed;
	}
}
