package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is 1+1?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("2")) {
		// 4.  if the user's answer was correct, add one to their score 
		score = score+1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answe = JOptionPane.showInputDialog("What is your name?");
		// 6.  After all the questions have been asked, print the user's score 
		if(answe.equals("Jeff")) {
			score ++;
		}
		
	
		
		
		
	
		
		
		JOptionPane.showMessageDialog(null, "you got a score of " + score + " out of 2!");
	}
}
