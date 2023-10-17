/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame implements ActionListener{
    private JButton buttons[];
    private final String names[] = { "Hide North", "Hide South",
        "Hide East", "Hide West", "Hide Center" };
    private BorderLayout layout;
    
    public BorderLayoutDemo()
    {
        super("BorderLayout Demo");
        
        layout = new BorderLayout(5,5);
        
        Container container = getContentPane();
        container.setLayout(layout);
        
        buttons = new JButton[names.length];
        
        for(int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }
        
        container.add(buttons[0], BorderLayout.NORTH);
        container.add(buttons[1], BorderLayout.SOUTH);
        container.add(buttons[2], BorderLayout.EAST);
        container.add(buttons[3], BorderLayout.WEST);
        container.add(buttons[4], BorderLayout.CENTER);
        
        setSize(300, 200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        for(int count = 0; count < buttons.length; count++)
            
            if(event.getSource() == buttons[count])
                buttons[count].setVisible(false);
            else
                buttons[count].setVisible(true);
        
        layout.layoutContainer(getContentPane());
    }
    
    public static void main(String args[])
    {
        BorderLayoutDemo appliction = new BorderLayoutDemo();
        appliction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
