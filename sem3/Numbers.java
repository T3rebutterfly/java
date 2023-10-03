package sem3;

import javax.swing.*;

public class Numbers {
 
    public static void main(String args[])
    {
        JTextArea mmm = new JTextArea();
        String output="";
        int a[] = new int[ 15 ];
        for (int i = 0; i <= 14; i++)
        {
            a[i] = (int)(Math.random()*200);
            output += " " + a[i];
        }
        mmm.setText(output);
        JOptionPane.showMessageDialog( null, mmm, "Numbers", JOptionPane.INFORMATION_MESSAGE);
        int max = 0;
        for (int i = 0; i <= 14; i++)
            if (a[i]>max) max = a[i];
        JOptionPane.showMessageDialog( null, "Maximum: " + max, "Maximum too", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
