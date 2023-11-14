/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Syragch {
    public String owog;
    public String name;
    public int age;

    public void print(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JTextField owogField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();

        panel.add(new JLabel("Owog:"));
        panel.add(owogField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Age:"));
        panel.add(ageField);

        int result = JOptionPane.showConfirmDialog(frame, panel, "Enter Information",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            owog = owogField.getText();
            name = nameField.getText();
            age = Integer.parseInt(ageField.getText());

            JOptionPane.showMessageDialog(frame, "Entered Information:\n\n"
                    + "Owog: " + owog + "\nName: " + name + "\nAge: " + age);
        }
    }
}

public class SuragchApp {
    public static void main(String[] args) {
        final int clas = 2;
        JFrame frame = new JFrame("Syragch Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int s = 0;
        int v = 0;
        int avg;

        for (int i = 0; i < clas; ++i) {
            Syragch tr = new Syragch();
            tr.print(frame);
            s = s + tr.age;
            v++;
        }

        avg = s / v;
        JOptionPane.showMessageDialog(frame, "Dundaj nas = " + avg);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
