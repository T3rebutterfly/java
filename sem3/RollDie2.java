package sem3;

import javax.swing.*;

public class RollDie2 {
    
    public static void main(String args[])
    {
        int frequency[] = new int[7];
        for ( int roll = 1; roll <= 6000; roll++ )
        ++frequency[ 1 + ( int ) ( Math.random() * 6 ) ];

        String output = "Face\tFrequency";

        for ( int face = 1; face < frequency.length; face++ )
        output += "\n" + face + "\t" + frequency[ face ];

        JTextArea outputArea = new JTextArea();
        outputArea.setText( output );

        JOptionPane.showMessageDialog( null, outputArea,
        "Rolling a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE );

        System.exit( 0 );
    }
}
