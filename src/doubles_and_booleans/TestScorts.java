package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScorts {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Please enter your test score.");
		double score = Double.parseDouble(input);
		if(score > 90.0) 
		{
			JOptionPane.showMessageDialog(null, "Wow, your hard work paid off.");
		}
		else if(score > 80.0) 
		{
			JOptionPane.showMessageDialog(null, "Good job. What would it take to get an A, next time?");
		}
		else if(score > 70.0) 
		{
			JOptionPane.showMessageDialog(null, "Work hard, and you can do better");
		}
		else if(score > 60.0) 
		{
			JOptionPane.showMessageDialog(null, "I don't think you studied for this one. Is everything ok?");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "How can I help? What's going on?");
		}
		
	}
	
}
