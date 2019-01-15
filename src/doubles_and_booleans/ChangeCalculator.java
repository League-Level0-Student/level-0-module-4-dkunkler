package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String input = JOptionPane.showInputDialog("How many nickels do you have?");
		double money = Integer.parseInt(input) * .05;
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
		input = JOptionPane.showInputDialog("How many dimes do you have?");
		money += Integer.parseInt(input) * .1;

		// Ask the user how many quarters they have, and convert their answer
		input = JOptionPane.showInputDialog("How many quarters do you have?");
		money += Integer.parseInt(input) * .25;

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null,  "You have $" + money + ", in change.");
	}
}

