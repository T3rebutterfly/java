/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Car {
    private String name;
    private double hurd;

    public Car(String ch, double h) {
        name = ch;
        hurd = h;
    }

    public void show(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Car Name:");
        JTextField nameField = new JTextField(name);
        nameField.setEditable(false);

        JLabel hurdLabel = new JLabel("Hurd:");
        JTextField hurdField = new JTextField(Double.toString(hurd));
        hurdField.setEditable(false);

        JLabel timeLabel = new JLabel("Hugatsaa oruulna uu:");
        JTextField timeField = new JTextField();

        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int time = Integer.parseInt(timeField.getText());
                    double result = hurd * time;
                    resultLabel.setText("Ywsan zam: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input for Hugatsaa!");
                }
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(hurdLabel);
        panel.add(hurdField);
        panel.add(timeLabel);
        panel.add(timeField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class CarApp {
    public static void main(String[] args) {
        Car c = new Car("Prius-20", 100);

        JFrame frame = new JFrame("Car Information");
        c.show(frame);
    }
}