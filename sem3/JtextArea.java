package sem3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JtextArea {
    
    public static void main (String args[])
    {
        String output;
        JTextArea mmm = new JTextArea();
        mmm.setText("Sirname: \tBold \n Name: \tBat");
        JOptionPane.showMessageDialog( null, mmm, "Anket",
        JOptionPane.INFORMATION_MESSAGE);
        output = "Ovog: Bold \n Ner: Bat";
        mmm.setText(output);
        JOptionPane.showMessageDialog( null, mmm, "Anket",
        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);}
}
