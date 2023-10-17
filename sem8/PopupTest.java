/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PopupTest extends JFrame{
    private JRadioButtonMenuItem items[];
    private final Color colorValues[] = 
        {Color.BLUE, Color.YELLOW, Color.RED};
    private JPopupMenu popupMenu;
    
    public PopupTest()
    {
        super("Using JPopupMenus");
        
        ItemHandler handler = new ItemHandler();
        String color[] = {"Blue","Yellow","Red"};
        
        ButtonGroup colorGroup = new ButtonGroup();
        popupMenu = new JPopupMenu();
        items = new JRadioButtonMenuItem[3];
        
        for (int count = 0; count < items.length; count++)
        {
            items[count] = new JRadioButtonMenuItem(color[count]);
            popupMenu.add(items[count]);
            colorGroup.add(items[count]);
            items[count].addActionListener(handler);
        }
        
        getContentPane().setBackground(Color.WHITE);
        
        addMouseListener(
            
            new MouseAdapter()
            {
                public void mousePressed(MouseEvent event)
                {
                    checkForTriggerEvent(event);
                }
                
                public void mouseReleased(MouseEvent event)
                {
                    checkForTriggerEvent(event);
                }
                private void checkForTriggerEvent(MouseEvent event)
                {
                    if(event.isPopupTrigger())
                        popupMenu.show(
                            event.getComponent(), event.getX(),event.getY());
                }
            });
        setSize(300,200);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        PopupTest application = new PopupTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class ItemHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            for(int i = 0; i < items.length; i++)
                if(event.getSource() == items[i])
                {
                    getContentPane().setBackground(colorValues[i]);
                    return;
                }
        }
    }
}
