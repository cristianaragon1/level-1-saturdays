package claculatorpack;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {

	JFrame newFrame = new JFrame();
	JPanel newPanel = new JPanel();
	JPanel newPanel2 = new JPanel();
	JLabel newLabel = new JLabel("Display");
	JButton button0 = new JButton("0");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton buttonAC = new JButton("AC");
	JButton buttonD = new JButton("/");
	JButton buttonX = new JButton("x");
	JButton buttonSub = new JButton("-");
	JButton buttonAdd = new JButton("+");
	JButton buttonEqual = new JButton("=");

	public View() {
		newFrame.add(newPanel2);
		newPanel2.setLayout(new GridLayout(1, 2));
		newFrame.add(newPanel);
		newLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		newPanel.setLayout(new GridLayout(4, 4));
		newFrame.setVisible(true);
		newPanel.add(button0);
		newPanel.add(button1);
		newPanel.add(button2);
		newPanel.add(button3);
		newPanel.add(button4);
		newPanel.add(button5);
		newPanel.add(button6);
		newPanel.add(button7);
		newPanel.add(button8);
		newPanel.add(button9);
		newPanel.add(buttonAC);
		newPanel.add(buttonD);
		newPanel.add(buttonX);
		newPanel.add(buttonSub);
		newPanel.add(buttonAdd);
		newPanel.add(buttonEqual);

		newFrame.pack();

	}

}
