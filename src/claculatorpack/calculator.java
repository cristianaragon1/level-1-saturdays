package claculatorpack;

public class calculator {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller cont = new Controller(view, model);

	}
}
