/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Point {
    public float x, y;
}

class Rectangular extends Point {
    public Rectangular(float x1, float x2) {
        x = x1;
        y = x2;
    }

    void print() {
        JOptionPane.showMessageDialog(null, "Long = " + x + "\nHigh = " + y, "Rectangular Long and High", JOptionPane.INFORMATION_MESSAGE);
    }
}

public class RectangularApp {
    public static void main(String[] args) {
        Rectangular s = new Rectangular(20.4f, 30.5f);
        JOptionPane.showMessageDialog(null, "Rectangular Long and High", "Title", JOptionPane.INFORMATION_MESSAGE);
        s.print();
    }
}

