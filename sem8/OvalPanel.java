/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import javax.swing.*;

public class OvalPanel extends JPanel{
    private int diameter = 10;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.fillOval(10, 10, diameter, diameter);
    }
    
    public void setDiameter(int newDiameter)
    {
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint();
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(200,200);
    }
    
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
}
