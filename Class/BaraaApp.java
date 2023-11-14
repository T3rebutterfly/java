/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Baraa {
    private int number;
    private String name;
    private float price;

    void print() {
        JFrame frame = new JFrame("Baraa Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Baraanii niit toog oruulna uu:");
        JTextField inputField1 = new JTextField();
        panel.add(label1);
        panel.add(inputField1);

        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(inputField1.getText());

                for (int i = 1; i <= a; i++) {
                    JTextField inputField2 = new JTextField();
                    JTextField inputField3 = new JTextField();
                    JTextField inputField4 = new JTextField();

                    panel.add(new JLabel("Baraa [" + i + "]"));
                    panel.add(new JLabel("Baraanii too shirheg:"));
                    panel.add(inputField2);
                    panel.add(new JLabel("Baraanii ner:"));
                    panel.add(inputField3);
                    panel.add(new JLabel("Baraanii une:"));
                    panel.add(inputField4);
                    panel.add(new JLabel());

                    int result = JOptionPane.showConfirmDialog(frame, panel, "Baraa Information",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                    if (result == JOptionPane.OK_OPTION) {
                        number = Integer.parseInt(inputField2.getText());
                        name = inputField3.getText();
                        price = Float.parseFloat(inputField4.getText());

                        JOptionPane.showMessageDialog(null,"Too shirheg: " + number + "\nName: " + name + "\nPrice: " + price);
                    }
                }
                JOptionPane.showMessageDialog(frame, "Niit Baraa(" + a + ")");
            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

public class BaraaApp {
    public static void main(String[] args) {
        Baraa b = new Baraa();
        b.print();
    }
}
