import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.plaf.SeparatorUI;

public class LeagueInvaders {
	JFrame mainFrame;
	final int WIDTH = 500;
	final int HEIGHT = 800;
	
	GamePanel panelgame = new GamePanel();
public static void main(String[] args) {
	LeagueInvaders window = new LeagueInvaders();
	
}
public LeagueInvaders(){
	mainFrame = new JFrame();
	mainFrame.setSize(WIDTH, HEIGHT);
	setup();

}
public void setup(){
	mainFrame.add(panelgame);
	mainFrame.addKeyListener(panelgame);
	mainFrame.setVisible(true);
	mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
	panelgame.startGame();
}
}
