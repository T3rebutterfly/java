/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomPanelTest extends JFrame{
    private JPanel buttonPanel;
    private CustomPanel myPanel;
    private JButton circleButton, squareButton;
    
    public CustomPanelTest()
    {
        super("CustomPanel Test");
        
        myPanel = new CustomPanel();
        myPanel.setBackground(Color.GREEN);
        
        squareButton = new JButton("Square");
        squareButton.addActionListener(
            
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    myPanel.draw(CustomPanel.SQUARE);
                }
            });
        
        circleButton = new JButton("Circle");
        circleButton.addActionListener(
        
            new ActionListener(){
                
                public void actionPerformed(ActionEvent event)
                {
                    myPanel.draw(CustomPanel.CIRCLE);
                }
            });
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(circleButton);
        buttonPanel.add(squareButton);
        
        Container container = getContentPane();
        container.add(myPanel, BorderLayout.CENTER);
        container.add(buttonPanel,BorderLayout.SOUTH);
        
        setSize(300,150);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        CustomPanelTest application = new CustomPanelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
