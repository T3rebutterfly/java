/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Time {
    private int time;
    private float second;
    private int minut;

    Time(int t, int m, float s) {
        time = t;
        minut = m;
        second = s;
    }

    void Tprint() {
        JOptionPane.showMessageDialog(null, "Time: " + time + ":" + minut + ":" + second);
    }

    void keybord() {
        String timeStr = JOptionPane.showInputDialog("Tsag oruulna uu:");
        time = Integer.parseInt(timeStr);

        String minutStr = JOptionPane.showInputDialog("Minut oruulna uu:");
        minut = Integer.parseInt(minutStr);

        String secondStr = JOptionPane.showInputDialog("Secund oruulna uu:");
        second = Float.parseFloat(secondStr);
    }

    void kprint() {
        JOptionPane.showMessageDialog(null,"Time: " + time + ":" + minut + ":" + second);
    }
}

public class TimeApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Time Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Enter Time");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Time t = new Time(0, 0, 0);
                t.keybord();
                t.kprint();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
