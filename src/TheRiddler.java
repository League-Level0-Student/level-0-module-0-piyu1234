import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;	 


		
String Riddle;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
Riddle=JOptionPane.showInputDialog("You can see me in water, but I never get wet. What am I?"); 

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(Riddle.equals("reflection"))   {
JOptionPane.showMessageDialog(null, "correct!");
score= score + 1;
}
else {
JOptionPane.showMessageDialog(null, "wrong, reflection");
}
		// 5. Otherwise, say "wrong" and tell them the answer
JOptionPane.showMessageDialog(null, "score "+score);       
		// 6. Add some more riddles
Riddle=JOptionPane.showInputDialog("What 4-letter word can be written forward, backward or upside down, and can still be read from left to right?");
if(Riddle.equals("noon"))   {
JOptionPane.showMessageDialog(null, "correct!");
score= score + 1;
}
else {
JOptionPane.showMessageDialog(null, "wrong, noon");
}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "score "+score);		
	}
}
