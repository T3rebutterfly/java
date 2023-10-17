/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelfContainedPanel extends JPanel{
    private int x1, y1, x2, y2;
    
    public SelfContainedPanel()
    {
        addMouseListener(
            
            new MouseAdapter()
            {
                public void mousePressed(MouseEvent event)
                {
                    x1 = event.getX();
                    y1 = event.getY();
                }
                
                public void mouseReleased(MouseEvent event)
                {
                    x2 = event.getX();
                    y2 = event.getY();
                    repaint();
                }
            });
        
        addMouseMotionListener(
        
            new MouseMotionAdapter()
            {
                public void mouseDragged(MouseEvent event)
                {
                    x2 = event.getX();
                    y2 = event.getY();
                    repaint();
                }
            });
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(150,100);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawOval(Math.min(x1,x2),Math.min(y1,y2),
                Math.abs(x1-x2),Math.abs(y1-y2));
    }
}
