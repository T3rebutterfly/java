package sem4;

import javax.swing.JApplet;
import javax.swing.*;
import java.awt.event.*;

public class daalgavar extends JApplet implements ActionListener{  
    
    JButton b;  
    JTextField tf;  
    
    public void init(){  

        tf = new JTextField();  
        tf.setBounds(30,10,160,30);  

        b = new JButton("Click");  
        b.setBounds(70,50,80,40);  

        add(b);add(tf);  
        b.addActionListener(this);  

        setLayout(null);  
    }  
  
public void actionPerformed(ActionEvent e){  
    tf.setText("Welcome To Java");  
    }  
}  