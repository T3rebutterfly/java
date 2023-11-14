/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daalgavar;

import javax.swing.*;

public class ComboBoxExample {
    JFrame f;
    ComboBoxExample()
    {
        f = new JFrame("ComboBox Example");
        String country[]={"India","U.S.A","England","Newzealand"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ComboBoxExample();
    }
}
