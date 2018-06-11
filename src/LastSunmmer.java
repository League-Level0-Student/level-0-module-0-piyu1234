import javax.swing.JOptionPane;

public class LastSunmmer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		String activity = JOptionPane.showInputDialog("What did you do last summer?");
		JOptionPane.showMessageDialog(null,
				"I know you did " + activity + " Muh" + name + " Hey " + name + " is so cool! I love you " + name);

	}
}
