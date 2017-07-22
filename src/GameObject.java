import java.awt.Graphics;

import com.sun.javafx.geom.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	Boolean isAlive = true;
	Rectangle collisionBox;
	public void update() {
		
	}

	public void draw(Graphics g) {

	}
	public GameObject(){
		collisionBox = new Rectangle();
	}
}
