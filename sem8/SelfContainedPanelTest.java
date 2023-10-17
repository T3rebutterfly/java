/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import sem8.SelfContainedPanel;

public class SelfContainedPanelTest extends JFrame{
    private SelfContainedPanel myPanel;
    
    public SelfContainedPanelTest()
    {
        myPanel = new SelfContainedPanel();
        myPanel.setBackground(Color.YELLOW);
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(myPanel);
    
    addMouseMotionListener(
            
        new MouseMotionListener(){

            public void mouseDragged(MouseEvent event)
            {
                setTitle("Dragging: x=" + event.getX() +
                        "; y=" + event.getY());
            }

            public void mouseMoved(MouseEvent event)
            {
                setTitle("Moving: x=" + event.getX() +
                        "; y=" + event.getY());
            }
        });
    
        setSize(300,200);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        SelfContainedPanelTest application = new SelfContainedPanelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}