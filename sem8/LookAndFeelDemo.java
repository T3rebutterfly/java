/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LookAndFeelDemo extends JFrame
{
    private final String strings[] = { "Metal","Motif","Windows" };
    private UIManager.LookAndFeelInfo looks[];
    private JRadioButton radio[];
    private ButtonGroup group;
    private JButton button;
    private JLabel label;
    private JComboBox comboBox;

    public LookAndFeelDemo()
    {
        super("Look and Feel Demo");
        
        Container container = getContentPane();
        
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(3,1,0,5));
        
        label = new JLabel("This is a Metal look-and-feel",
            SwingConstants.CENTER);
        northPanel.add(label);
        
        button = new JButton("JButton");
        northPanel.add(button);
        
        comboBox = new JComboBox(strings);
        northPanel.add(comboBox);
        
        radio = new JRadioButton[strings.length];
        
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1,radio.length));
        
        group = new ButtonGroup();
        ItemHandler handler = new ItemHandler();
        
        for(int count = 0; count < radio.length; count++)
        {
            radio[count] = new JRadioButton(strings[count]);
            radio[count].addItemListener(handler);
            group.add(radio[count]);
            southPanel.add(radio[count]);
        }
        
        container.add(northPanel, BorderLayout.NORTH);
        container.add(southPanel, BorderLayout.SOUTH);
        
        looks = UIManager.getInstalledLookAndFeels();
        
        setSize(300,200);
        setVisible(true);
        
        radio[0].setSelected(true);
    }
    
    private void changeTheLookAndFeel(int value)
    {
        try
        {
            UIManager.setLookAndFeel(looks[value].getClassName());
            SwingUtilities.updateComponentTreeUI(this);
        }
        
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        LookAndFeelDemo application = new LookAndFeelDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class ItemHandler implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            for(int count = 0; count < radio.length; count++)
                if(radio[count].isSelected())
                {
                    label.setText("This is a "+
                        strings[count] + "look-and-feel");
                    comboBox.setSelectedIndex(count);
                    changeTheLookAndFeel(count);
                }
        }
    }
}