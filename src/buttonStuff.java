import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class buttonStuff implements ActionListener {
	public static void main(String[] args) {
		buttonStuff clazz = new buttonStuff();
		clazz.createUI();
	}

	JButton buttonOne = new JButton("Add");
	JButton buttonTwo = new JButton("Subtract");
	JButton buttonThree = new JButton("Random");
	int number = 0;
	JLabel nummber = new JLabel("" + number);
	Random numberRandom = new Random();

	public void createUI() {
		JFrame calculator = new JFrame("Fax");
		JPanel panel = new JPanel();
		calculator.setVisible(true);
		calculator.add(panel);
		panel.add(nummber);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		calculator.pack();
		ImageIcon icon = new ImageIcon("test.jpg");
		buttonOne.setIcon(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == buttonOne) {
			number += 1;
			nummber.setText("" + number);
		}
		if (e.getSource() == buttonTwo) {
			number -= 1;
			nummber.setText("" + number);
		}
		if (e.getSource() == buttonThree) {

			nummber.setText("" + numberRandom.nextInt(50));
		}
	}

}
