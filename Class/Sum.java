/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum extends JFrame {
    private JTextField numberField1;
    private JTextField numberField2;

    public Sum() {
        setTitle("Sum Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createComponents();
        setLayout(new FlowLayout());

        addComponents();
    }

    private void createComponents() {
        numberField1 = new JTextField(10);
        numberField2 = new JTextField(10);

        JButton calculateButton = new JButton("Calculate Sum");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateButtonClicked();
            }
        });
    }

    private void addComponents() {
        add(new JLabel("Enter a number:"));
        add(numberField1);

        add(new JLabel("Enter another number:"));
        add(numberField2);

        JButton calculateButton = new JButton("Calculate Sum");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateButtonClicked();
            }
        });
        add(calculateButton);

        add(new JLabel("Sum: "));
    }

    private void calculateButtonClicked() {
        try {
            int a = Integer.parseInt(numberField1.getText());
            int b = Integer.parseInt(numberField2.getText());

            int sum = a + b;

            JOptionPane.showMessageDialog(this, "Sum: " + sum);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sum().setVisible(true);
            }
        });
    }
}
