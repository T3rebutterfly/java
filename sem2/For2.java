package sem2;

import javax.swing.JOptionPane;

public class For2 {
    
    public static void main (String args[])
    {
        int total = 0 ;
        for(int number = 2; number <= 100; number +=2)
            total += number;
        JOptionPane.showMessageDialog(null, "The sum is " + total, "Total Even Integers from 2 to 100", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
