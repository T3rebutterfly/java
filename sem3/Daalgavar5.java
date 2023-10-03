package sem3;

import javax.swing.*;

public class Daalgavar5{
    public static void main(String args[])
    {
        int i, j, temp;
        String iString, jString;
        int a[] = {1, 3, 5, 2, 7, 3, 5, 7};
        System.out.println("Anhnii massiv");
        for (int x = 1; x<a.length; x++)
        System.out.print(" " + a[ x ]);

        iString = JOptionPane.showInputDialog("Ehnii index:");
        jString = JOptionPane.showInputDialog("Daraagiin index:");

        i = Integer.parseInt(iString);
        j = Integer.parseInt(jString);

        temp = a[ i ];
        a[ i ] = a[ j ];
        a[ j ] = temp;

        System.out.println("Utgiig solisnii daraa: ");
        for (int x = 1; x<a.length; x++)
        System.out.print(" " + a[ x ]);
    }
}