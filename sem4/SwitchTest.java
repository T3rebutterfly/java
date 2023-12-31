package sem4;

import java.awt.Graphics;
import javax.swing.*;

public class SwitchTest extends JApplet{
    int choice;
    
    public void init()
    {
        String input;
        
        input = JOptionPane.showInputDialog("Enter 1 to draw lines\n" + "Enter 2 to draw rectangles\n" + "Enter 3 to draw ovals\n");
        
        choice = Integer.parseInt(input);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        
        for(int i = 0; i < 10; i++)
        {
            switch (choice)
            {
                case 1:
                    g.drawLine(10,10,250,10 + i * 10);
                    break;
                case 2:
                    g.drawRect(10 + i * 10 ,10 + i * 10,50 + i * 10,50 + i * 10);
                    break;
                case 3:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i *10);
                    break;
                default:
                    g.drawString("Invalid value entered", 10, 20 + i * 15);
            }
        }
    }
}