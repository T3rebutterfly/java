/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame{
    private JButton leftButton, centerButton, rightButton;
    private Container container;
    private FlowLayout layout;
    
    public FlowLayoutDemo()
    {
        super("FlowLayout Demo");
        
        layout = new FlowLayout();
        
        container = getContentPane();
        container.setLayout(layout);
        
        leftButton = new JButton("Left");
        container.add(leftButton);
        leftButton.addActionListener(
                
            new ActionListener() {

                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.LEFT);
                    
                    layout.layoutContainer(container);
                }
            });
        
        centerButton = new JButton("Center");
        container.add(centerButton);
        centerButton.addActionListener(
            
            new ActionListener(){
                
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.CENTER);
                    
                    layout.layoutContainer(container);
                }
            });
        
        rightButton = new JButton("Right");
        container.add(rightButton);
        rightButton.addActionListener(
            
            new ActionListener(){
                
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.RIGHT);
                    
                    layout.layoutContainer(container);
                }
            });
        
        setSize(300,75);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        FlowLayoutDemo application = new FlowLayoutDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
