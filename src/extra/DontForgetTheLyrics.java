package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess
	 * the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */

	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		int score = 0;
		JOptionPane.showMessageDialog(null, "Listen to the song clip, then enter the next two words of the lyrics.");
		// 5. Use the playSound method to play your song.

		playSound("royals.wav");
		// 6. Make a pop-up for the player to type their answer.
		String input = JOptionPane.showInputDialog("When the song stops, what are the next two words of the lyrics?");
		input = input.toLowerCase();
		// 7. If they answered correctly, tell them that they were right.
		if (input.equals("royals royals") || input.equals("royals,royals") || input.equals("royals, royals")
				|| input.equals("royalsroyals")) {
			JOptionPane.showMessageDialog(null, "You got it right!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Oops. The correct answer is: royals royals");
		}

		playSound("digdown.wav");
		// 6. Make a pop-up for the player to type their answer.
		input = JOptionPane.showInputDialog("When the song stops, what are the next two words of the lyrics?");
		input = input.toLowerCase();
		// 7. If they answered correctly, tell them that they were right.
		if (input.equals("dig down") || input.equals("digdown")) {
			JOptionPane.showMessageDialog(null, "You got it right!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Oops. The correct answer is: royals royals");
		}

		JOptionPane.showMessageDialog(null, "Your score is: " + score);
		// 8. Otherwise, tell them they are wrong, and give them the answer.

		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		if (audioClip != null) {
			System.out.println("Playing " + fileName);
			audioClip.play();
		} else {
			System.out.println("Unable to open " + fileName);
		}
	}
}
