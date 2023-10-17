/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaDemo extends JFrame{
    private JTextArea textArea1, textArea2;
    private JButton copyButton;
    
    public TextAreaDemo()
    {
        super("TextArea Demo");
        
        Box box = Box.createHorizontalBox();
        
        String string = "This is demo string to\n" + 
            "illustrate copying text\nfrom one textarea to \n" +
            "another textarea using a\nnextarnel event\n";
        
        textArea1 = new JTextArea(string, 10, 15);
        box.add(new JScrollPane(textArea1));
        
        copyButton = new JButton("Copy >>>");
        box.add(copyButton);
        copyButton.addActionListener(
            
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    textArea2.setText(textArea1.getSelectedText());
                }
            });
        
        textArea2 = new JTextArea(10,15);
        textArea2.setEditable(false);
        box.add(new JScrollPane(textArea2));
        
        Container container = getContentPane();
        container.add(box);
        
        setSize(425,200);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        TextAreaDemo application = new TextAreaDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
