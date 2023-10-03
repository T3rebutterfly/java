package sem1;
import javax.swing.JOptionPane;
public class daalgavar2 {
    public static void main(String args[])
    {
        int a;
        double talbai;
        double toirgo;
        String input; 

        input = JOptionPane.showInputDialog(null, "Enter frist nmuber: ");
        a=Integer.parseInt(input);
    
        talbai = Math.PI * a*a;
        
        toirgo = 2 * Math.PI * a;
        
        JOptionPane.showMessageDialog(null,"toirgiin talbai: " + talbai);
        JOptionPane.showMessageDialog(null,"toirgiin urt: " + toirgo);
    }
}
