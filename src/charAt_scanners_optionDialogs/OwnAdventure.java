package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Once upon a time, there were three little pigs.");
		int choice = JOptionPane.showOptionDialog(null, "Which pig do you follow?", "Which pig?", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Optimist", "Pessimist", "Realist" }, null);
		int risk = 0;

		switch (choice) {
		case 0:
			JOptionPane.showMessageDialog(null, "The optimist pig invited the wolf to dinner, to make friends.");
			risk += 2;
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "The pessimist pig barricaded his home to keep the wolf out.");
			risk -= 1;
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "The realist pig met the wolf for dinner in a crowded public place.");
			risk += 1;
			break;
		}

		if (choice == 0) {
			int choice2 = JOptionPane.showOptionDialog(null, "What do you have for dinner?", "What's for dinner?", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Bascon and Eggs", "Fried chicken", "Vegetable soup" }, null);
			switch (choice2) {
			case 0:
				JOptionPane.showMessageDialog(null, "The wolf is very pleased with dinner.");
				risk += 2;
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "The wolf is satisfied with dinner.");
				risk += 1;
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "the wolf is surprised by how much he enjoys the soup.");
				risk -= 1;
				break;

			}
		} else if (choice == 1) {
			int choice2 = JOptionPane.showOptionDialog(null, "What do you barricadae your home with?", "Barricade", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Bricks", "Ring security system", "A flaming hot doorknob" }, null);
			switch (choice2) {
			case 0:
				JOptionPane.showMessageDialog(null, "The wolf isn't able to get in, but you aren't able to get out.");
				risk -= 1;
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "You see the wolf at your door, and ignore him.");
				risk -= 1;
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "The wolf hesitates and the door and tries a window");
				risk += 2;
				break;
			}
		} else {
			int choice2 = JOptionPane.showOptionDialog(null,  "What do you talk about at dinner?", "Dinner conversation", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "The wolf's interests", "Find common interests", "Hunting" }, null);
			switch (choice2) {
			case 0:
				JOptionPane.showMessageDialog(null, "The wolf is a chef, specializing in cured meats.");
				risk += 1;
				break;
			case 1:
				JOptionPane.showMessageDialog(null,
						"You discover the wolf also likes to get dirty and roll in the mud.");
				risk -= 1;
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "The wolf follows you home.");
				risk += 2;
				break;
			}
		}

		if (risk >= 4) {
			int choice3 = JOptionPane.showOptionDialog(null, "With the wolf at your door, what do you do?", "He's at your door", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Hide", "Escape", "Confront" }, null);
			switch (choice3) {
			case 0:
				JOptionPane.showMessageDialog(null, "The wolf can smell you, finds you, and eats you.");
				risk += 1;
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "You get away from the wolf, and become a pessimist.");
				risk -= 1;
				break;
			case 2:
				JOptionPane.showMessageDialog(null,
						"The wolf backs down from your strong stance, and leaves you alone.");
				risk += 2;
				break;

			}
		} else if (risk >= 2) {
			int choice3 = JOptionPane.showOptionDialog(null, "Passersby", "You see the wolf in the street, what do you do?", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cross to the other side",
							"Ignore and walk on", "Wish him a pleasant day, and walk on." },
					null);
			switch (choice3) {
			case 0:
				JOptionPane.showMessageDialog(null, "The wolf senses our fear and follows you home.");
				risk += 1;
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "The wolf ignores you.");
				risk -= 1;
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "The wolf tips his hat, and goes about his day.");
				risk += 2;
				break;
			}

		} else {
			int choice3 = JOptionPane.showOptionDialog(null, "The wolf is no longer seen. What do you do?", "What now?", 0, 
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Find out what happened to him", "Look for him",
							"Continue your life without the wolf in it." },
					null);
			switch (choice3) {
			case 0:
				JOptionPane.showMessageDialog(null, "The wolf has moved away.");
				risk += 1;
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "You find the wolf, and he chases you.");
				risk -= 1;
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "You live happily ever after.");
				risk += 2;
				break;
			}
		}

	}
}