package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {
	static Scanner scanner = new Scanner(System.in);
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		String piString = "3.14159265359";
		
		for(int i = 0; i<10; i++)
		{
			System.out.print(piString.charAt(i));
			
		}
		System.out.println("");
		
		for(int i = 0; i<piString.length(); i++)
		{
			System.out.print(piString.charAt(i));
			
		}
		System.out.println("");
		
		for(int i = 0; i<piString.length(); i++)
		{
			speak(piString.charAt(i));
		}

		System.out.println("How many digits of pi do you know?");
		int i = 0;
		char input;
		
		
		while(true)
		{
			input = scanner.next().toCharArray()[0];
			if(piString.charAt(i)=='.')
			{
				i++; //skip the decimal point
			}
			if (input == piString.charAt(i))
			{
				System.out.println("Correct!");
				i++;
				if(i == piString.length())
				{
					System.out.println("That's a lot! Great job!");
					break;
				}
			}
			else
			{
				System.err.println("incorrect");
				break;
			}

					
		}
		scanner.close();
			
	}

	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.

	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"

	// 4. Print ALL the digits of of Pi (hint: use a loop)

	// 5. Use the speak() method to speak all the digits of Pi.

	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println

	static void speak(char characterToSpeak) {
		try {
			//Runtime.getRuntime().exec("say " + characterToSpeak).waitFor(); //doesn't work under Windows 10
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


