/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daalgavar;

import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click here");
        b.setBounds(50,100,95,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
