package Daalgavar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class HelloWorld extends JFrame {

    public HelloWorld() {
        // Set the title of the JFrame
        setTitle("Hello World JFrame");

        // Set the size of the JFrame
        setSize(200, 200);

        // Create a JPanel and add it to the JFrame
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Paint your content here
                g.drawString("Hello World", 20, 20);
            }
        };
        add(panel);

        // Make the JFrame visible
        setVisible(true);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Create an instance of HelloWorld
        HelloWorld helloWorldFrame = new HelloWorld();
    }
}
