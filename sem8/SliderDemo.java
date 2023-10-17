/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo extends JFrame{
    private JSlider diameterSlider;
    private OvalPanel myPanel;
    
    public SliderDemo()
    {
        super("Slider Demo");
        
        myPanel = new OvalPanel();
        myPanel.setBackground(Color.YELLOW);
        
        diameterSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        diameterSlider.setMajorTickSpacing(10);
        diameterSlider.setPaintTicks(true);
        
        diameterSlider.addChangeListener(
        
            new ChangeListener()
            {
                public void stateChanged(ChangeEvent e)
                {
                    myPanel.setDiameter(diameterSlider.getValue());
                }
            });
        Container container = getContentPane();
        container.add(diameterSlider, BorderLayout.SOUTH);
        container.add(myPanel,BorderLayout.CENTER);
        
        setSize(220,270);
        setVisible(true);
    }
    public static void main(String args[])
    {
        SliderDemo application = new SliderDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
