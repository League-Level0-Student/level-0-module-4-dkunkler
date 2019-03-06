package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		int num1 = 0;
		int num2 = 0;
		int answer = 0;
		String op1 = "";
		String op2 = "";
		num1 = JOptionPane.showOptionDialog(null,
				"Enter your number" , "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }, null);

		int operation = JOptionPane.showOptionDialog(null,
				num1 + " operation", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "*", "/" }, null);
		
		switch(operation) {
		case 0:
			op1 = "+";
			break;
		case 1:
			op1 = "-";
			break;
		case 2:
			op1 = "*";
			break;
		case 3:
			op1 = "/";
			break;
		}

		while(true) {
		num2 = JOptionPane.showOptionDialog(null,
				num1 + " " + op1 + " Enter your number", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }, null);

			
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			
			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.
			switch (operation) {
			case 0:
				answer = Add(num1, num2);
				break;
			case 1:
				answer = Subtract(num1, num2);
				break;
			case 2:
				answer = Multiply(num1, num2);
				break;
			case 3:
				answer = Divide(num1, num2);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, num1 + " " + op1 + " " + num2 + " = " + answer);	
				break;
			}

			
			
			operation = JOptionPane.showOptionDialog(null,
					num1 + " " + op1 + " " + num2, "Calculator", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "*", "/", "=" }, null);
			//op1 = "";
			switch(operation) {
			case 0:
				op1 = "+";
				num1 = Add(num1,num2);
				break;
			case 1:
				op1 = "-";
				num1 = Subtract(num1,num2);
				break;
			case 2:
				op1 = "*";
				num1 = Multiply(num1, num2);
				break;
			case 3:
				op1 = "/";
				num1 = Divide(num1, num2);
				break;
			case 4:
				
				JOptionPane.showMessageDialog(null, num1 + " " + op1 + " " + num2 + " = " + answer);
				System.exit(0);
				break;
			}
		}
			
			

		//}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	static int Add(int num1, int num2) {
		return num1 + num2;
	}

	static int Divide(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			return 0;
		}
	}

	static int Multiply(int num1, int num2) {
		return num1 * num2;
	}

	static int Subtract(int num1, int num2) {
		return num1 - num2;
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}