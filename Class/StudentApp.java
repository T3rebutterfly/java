/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Lesson {
    public int d1;
}

class Student extends Lesson {
    public void print(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JTextField countField = new JTextField();
        panel.add(new JLabel("Ta niit heden hicheel vzdg we?"));
        panel.add(countField);

        JButton enterButton = new JButton("Enter");
        panel.add(new JLabel("Ta hicheelvvdiinhee dvng oruulna uu"));
        panel.add(enterButton);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(countField.getText());
                    int s = 0;
                    int v = 0;
                    int avg;

                    for (int i = 1; i <= a; i++) {
                        String input = JOptionPane.showInputDialog("dvn[" + i + "] = ");
                        d1 = Integer.parseInt(input);
                        s += d1;
                        v++;
                    }

                    avg = s / v;

                    JOptionPane.showMessageDialog(frame, "Tanii dundaj dvn = " + avg,
                            "Result", JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student();

        JFrame frame = new JFrame("Student Information");
        student.print(frame);
    }
}
