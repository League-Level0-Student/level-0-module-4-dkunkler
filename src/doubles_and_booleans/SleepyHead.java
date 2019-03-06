package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int input = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if (input == JOptionPane.YES_OPTION)
        {
        	isWeekday = true;
        }
        else
        {
        	isWeekday = false;
        }
        

        input = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if (input == JOptionPane.YES_OPTION)
        {
        	isVacation = true;
        }
        else
        {
        	isVacation = false;
        }
        
        if(!isWeekday || isVacation)
        {
        	JOptionPane.showMessageDialog(null, "Sleep in!");
        }
        else if (isWeekday && !isVacation) 
        {
        	JOptionPane.showMessageDialog(null, "Get up lazybones!");
        }
        else if(isWeekday && isVacation)
        {
        	JOptionPane.showMessageDialog(null, "Sleep in!");
        }
        
        

        /*
         * Print â€œsleep inâ€? if it is a vacation or a weekend. If itâ€™s a weekday,
         * print â€œget up lazybones!â€? If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€?.
         */
    }
}
