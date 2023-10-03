package sem1;

import javax.swing.JOptionPane;

public class daalgavar3 {
     public static void main(String args[]){
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Toogoo oruul:"));
        if(number%2==0)
                JOptionPane.showMessageDialog(null, "Tegsh too");
        else
                JOptionPane.showMessageDialog(null, "Sondgoi too");
     }
}
