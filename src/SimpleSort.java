import javax.swing.JOptionPane;

public class SimpleSort {
	public static void main(String[] args) 
	{
	String input1 = JOptionPane.showInputDialog("Please enter the first of three numbers.");
	String input2 = JOptionPane.showInputDialog("Please enter the second of three numbers.");
	String input3 = JOptionPane.showInputDialog("Please enter the third of three numbers.");
	
	int num1 = Integer.parseInt(input1);
	int num2 = Integer.parseInt(input2);
	int num3 = Integer.parseInt(input3);
	System.out.println("Ascending order");
	
	if((num1 < num2) && (num1 < num3))
	{
		System.out.println(num1);
		if((num2 < num3))
		{
			System.out.println(num2);
			System.out.println(num3);
		}
		else 
		{
			System.out.println(num3);
			System.out.println(num2);
		}
	}
	else if((num2<num1)&&(num1<num3))
	{
		System.out.println(num2);
		if(num1 < num3) {
			System.out.println(num1);
			System.out.println(num3);
		}
		else
		{
			System.out.println(num3);
			System.out.println(num1);
		}
			
	}
	else
	{
		System.out.println(num3);
		if(num1 < num2)
		{
			System.out.println(num1);
			System.out.println(num2);
		}
		else
		{
			System.out.println(num2);
			System.out.println(num1);
		}
	}
	
	//descending order
	System.out.println("Descending order");
	if((num1 > num2) && (num1 > num3))
	{
		System.out.println(num1);
		if((num2 > num3))
		{
			System.out.println(num2);
			System.out.println(num3);
		}
		else 
		{
			System.out.println(num3);
			System.out.println(num2);
		}
	}
	else if((num2>num1)&&(num1>num3))
	{
		System.out.println(num2);
		if(num1 > num3) {
			System.out.println(num1);
			System.out.println(num3);
		}
		else
		{
			System.out.println(num3);
			System.out.println(num1);
		}
			
	}
	else
	{
		System.out.println(num3);
		if(num1 > num2)
		{
			System.out.println(num1);
			System.out.println(num2);
		}
		else
		{
			System.out.println(num2);
			System.out.println(num1);
		}
	}
	
}
	
	
	
}