import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1exam {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("Color Teacher");
		mainFrame.setVisible(true);
		JPanel mainpanel = new JPanel();
		mainFrame.add(mainpanel);
		JButton yellow = new JButton();
		JButton red = new JButton();
		JButton blue = new JButton();
		JButton green = new JButton();
		mainpanel.add(yellow);
		mainpanel.add(red);
		mainpanel.add(blue);
		mainpanel.add(green);
		mainFrame.pack();
		yellow.setBackground(Color.yellow);
		boolean isOpaque = true;
		yellow.setOpaque(isOpaque);
		red.setOpaque(isOpaque);
		blue.setOpaque(isOpaque);
		red.setBackground(Color.RED);
		blue.setBackground(Color.BLUE);
		green.setBackground(Color.green);
		
	}
}
