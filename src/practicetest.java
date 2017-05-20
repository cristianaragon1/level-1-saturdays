import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practicetest {
	public static void main(String[] args) {
		billnye scienceguy = new billnye();
	}

	public static void billnye() {
		JFrame Frame = new JFrame("meme");
		JLabel label = new JLabel("nice meme");
		JButton buttonone = new JButton("dank");
		JButton buttontwo = new JButton("normie");
		JTextField field = new JTextField();
		JPanel panel = new JPanel();
		Frame.setVisible(true);
		Frame.setSize(500, 500);
		Frame.add(label);
		panel.add(field);
		field.getText();
		panel.add(buttonone);
		panel.add(buttontwo);

	}
}
