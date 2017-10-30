import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		// 1: Write the names of all the students on the white board
		String name = JOptionPane.showInputDialog(null, "Hi, type your name in please");
		// 2: Depending on which user types their name, tell them something remarkable
		// about themselves
		String name1 = "Emerson";
		String name2 = "Priyankaa";
		String name3 = "Soumya";
		String name4 = "Keith";
		String name5 = "April";
		// 3: Have students walk round and try each other's programs
		if (name.equals(name1)) {
			JOptionPane.showMessageDialog(null, "You are a great reader");
		}
		if (name.equals(name2)) {
			JOptionPane.showMessageDialog(null, "You are a great gymnast");
		}
		if (name.equals(name3)) {
			JOptionPane.showMessageDialog(null, "You are a great singer");
		}
		if (name.equals(name4)) {
			JOptionPane.showMessageDialog(null, "You are a amazing teacher");
		}
		if (name.equals(name5)) {
			JOptionPane.showMessageDialog(null, "You are a great runner");
		}
	}
}