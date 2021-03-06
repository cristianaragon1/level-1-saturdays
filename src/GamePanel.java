import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer gametime = new Timer(1000 / 60, this);
	Rocketship rocket = new Rocketship(225, 700, 50, 50); 
	ObjectManager manager = new ObjectManager();
	Font titleFont;
	Font titleFontTwo;
	Font titleFontEnd;
	Font titleFontEndTwo;
	final int GAME_STATE = 0;
	final int MENU_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;

	// GameObject gameob = new GameObject();

	public GamePanel() {
		titleFont = new Font("Arial", Font.PLAIN, 48);
		titleFontTwo = new Font("Arial", Font.PLAIN, 28);
		titleFontEnd = new Font("Arial", Font.PLAIN, 48);
		titleFontEndTwo = new Font("Arial", Font.PLAIN, 28);
		manager.addObject(rocket); 
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

		// gameob.update();
	}

	public void startGame() {
		gametime.start();
	}

	public void paintComponent(Graphics g) {
		// gameob.draw(g);
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		manager.update();
		manager.manageEnemies();
		manager.checkCollision();
		manager.getScore();
		if (rocket.isAlive == false) {
			currentState = END_STATE;
			manager.reset();
			rocket = new Rocketship(255, 700, 50, 50);
			manager.addObject(rocket);
		}
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE.darker());
		g.fillRect(0, 0, 600, 900);
		g.setColor(Color.yellow);
		g.setFont(titleFont);
		g.drawString("League Invaders", 60, 200);
		g.setColor(Color.yellow);
		g.setFont(titleFontTwo);
		g.drawString("Press ENTER to start", 100, 300);

	}

	public void drawGameState(Graphics g) {

		g.setColor(Color.black);
		g.fillRect(0, 0, 600, 900);
		manager.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED.darker());
		g.fillRect(0, 0, 600, 900);
		g.setColor(Color.black);
		g.setFont(titleFontEnd);
		g.drawString("GAME OVER", 100, 200);
		g.setColor(Color.black);
		g.setFont(titleFontEndTwo);
		g.drawString("Press ENTER to restart", 60, 300);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keys");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
		if (e.getKeyCode() == 10) {
			currentState += 1;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			} else if (currentState > MENU_STATE) {
				currentState = GAME_STATE;
			} else if (currentState > GAME_STATE) {
				currentState = END_STATE;
			}

		}
		if (e.getKeyCode() == 39) {
			rocket.right();
		}if (e.getKeyCode() == 37) {
			rocket.left();
		}if (e.getKeyCode() == 38) {
			rocket.up();
		}if (e.getKeyCode() == 40) {
			rocket.down();
		}if (e.getKeyCode() == 32) {
			manager.addObject(new Projectile(rocket.x, rocket.y, 10, 10));

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("key r");
	}

}