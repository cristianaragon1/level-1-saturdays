import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
	public Alien(int x, int y, int widht, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;	
	}
	public void update(){
		y ++;
	}
	public void draw(Graphics g){
		g.setColor(Color.yellow);
		g.drawRect(x, y, width, height);
	}
}
