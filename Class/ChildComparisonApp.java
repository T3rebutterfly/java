/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Child1 {
    private String name1;
    private int age1;

    public Child1(String ch, int a) {
        name1 = ch;
        age1 = a;
    }

    public void Cprint() {
        JOptionPane.showMessageDialog(null, "Name: " + name1 + "\nAge: " + age1,
                "Child1 Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getName1() {
        return name1;
    }

    public int getAge1() {
        return age1;
    }
}

class Child2 {
    private String name2;
    private int age2;

    public Child2(String s, int b) {
        name2 = s;
        age2 = b;
    }

    public void print() {
        JOptionPane.showMessageDialog(null, "Name: " + name2 + "\nAge: " + age2,
                "Child2 Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getName2() {
        return name2;
    }

    public int getAge2() {
        return age2;
    }
}

public class ChildComparisonApp {
    public static void main(String[] args) {
        Child1 c1 = new Child1("Tuugii", 40);
        c1.Cprint();

        Child2 c2 = new Child2("Bataa", 30);
        c2.print();

        compareAndDisplay(c1, c2);
    }

    private static void compareAndDisplay(Child1 child1, Child2 child2) {
        if (child1.getAge1() > child2.getAge2()) {
            JOptionPane.showMessageDialog(null, "Younger Child: " + child2.getName2(),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Younger Child: " + child1.getName1(),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
