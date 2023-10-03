package sem2;

import javax.swing.JOptionPane;

public class oron {
    
    public static void main(String[] args)
    {
        String numberString;
        int number,count=0;
        numberString = JOptionPane.showInputDialog("Enter number:");
        number = Integer.parseInt(numberString);
        while (number>=1)
        {
            number = number/10;
            count++;
        }
        System.out.println("Orongiin too:" + count);
        System.exit(0);
    }
}
