package sem4;

import java.awt.Graphics;
import javax.swing.JApplet;

public class DoWhileTest extends JApplet{
    
    public void paint(Graphics g)
    {
        super.paint(g);
        
        int counter = 1;
        do
        {
            g.drawOval(110 - counter * 10, 110 - counter * 10, counter * 20, counter * 20);
            ++counter;
        }while(counter <= 10);
    }
}
