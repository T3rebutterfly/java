/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CipherApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cipher Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JLabel inputLabel = new JLabel("Utga oruul:");
        JTextField inputField = new JTextField();
        JButton encryptButton = new JButton("Encrypt");
        JLabel resultLabel = new JLabel();

        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    char encryptedChar = (char) (c - 2);
                    result.append(encryptedChar);
                }

                resultLabel.setText(result.toString());
            }
        });

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(encryptButton);
        panel.add(resultLabel);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
