
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String priyankaa = "flexibility";
		String emerson = "magical abilities";
		String grace = "tennis";
		String sofia = "eating";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String people = JOptionPane.showInputDialog("What is your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (people.equals("Priyankaa")) {
			JOptionPane.showMessageDialog(null, priyankaa);
		}
	}
}