/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DayOfWeekApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Day of Week Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JLabel resultLabel = new JLabel();

        JButton generateButton = new JButton("Generate Day");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int day = random.nextInt(7) + 1;

                switch (day) {
                    case 1:
                        resultLabel.setText("Monday");
                        break;
                    case 2:
                        resultLabel.setText("Tuesday");
                        break;
                    case 3:
                        resultLabel.setText("Wednesday");
                        break;
                    case 4:
                        resultLabel.setText("Thursday");
                        break;
                    case 5:
                        resultLabel.setText("Friday");
                        break;
                    case 6:
                        resultLabel.setText("Saturday");
                        break;
                    case 7:
                        resultLabel.setText("Sunday");
                        break;
                }
            }
        });

        panel.add(generateButton);
        panel.add(resultLabel);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
