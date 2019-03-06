package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		int happiness = 0;
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy

		while (true) {
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your " + pet, "Care for your " + pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Play Fetch", "Feed", "Go for a walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			switch (task) {
			case 0: 
				happiness = Fetch(happiness);
				break;
			
			case 1: 
				happiness = Feed(happiness);
				break;
			
			case 2: 
				happiness = Walk(happiness);
				break;
			
			}

			if (happiness > 10) {
				JOptionPane.showMessageDialog(null, "You love your " + pet + ", and it's very happy.");
				break;
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
		}
	}

	static int Fetch(int happiness) {
		return happiness+=3;
	}

	static int Feed(int happiness) {
		return happiness += 2;
	}

	static int Walk(int happiness) {
		return happiness += 1;
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}