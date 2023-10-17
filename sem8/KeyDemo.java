/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyDemo extends JFrame implements KeyListener {
    private String line1 = "", line2 = "", line3 = "";
    private JTextArea textArea;
    
    public KeyDemo()
    {
        super("Demonstrating Keystroke Events");
        
        textArea = new JTextArea(10,15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        getContentPane().add(textArea);
        
        addKeyListener(this);
        
        setSize(350, 100);
        setVisible(true);
    }
    
    public void keyPressed(KeyEvent event)
    {
        line1 = "Key pressed: " + event.getKeyText(event.getKeyCode());
        setLines2and3(event);
    }
    
    public void keyReleased(KeyEvent event)
    {
        line1 = "Key release: " + event.getKeyText(event.getKeyCode());
        setLines2and3(event);
    }
    
    public void keyTyped(KeyEvent event)
    {
        line1 = "Key typed: " + event.getKeyChar();
        setLines2and3(event);
    }
    
    private void setLines2and3(KeyEvent event)
    {
        line2 = "This key is " + (event.isActionKey() ? "" : "not")+
            "an action key";
        
        String temp = event.getKeyModifiersText(event.getModifiersEx());
        
        line3 = "Modifier keys pressed: " +
                (temp.equals("") ? "none" : temp);
        
        textArea.setText(line1 + "\n" + line2 + "\n" + line3 + "\n");
    }
    
    public static void main(String args[])
    {
        KeyDemo application = new KeyDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
