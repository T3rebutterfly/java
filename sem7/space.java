package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class space {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Space Scene Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Set the frame size

        // Create a JPanel to draw the space scene
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawSpaceScene(g);
                drawRocket(g);
                drawPlanet(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    // Method to draw the space scene
    private static void drawSpaceScene(Graphics g) {
        // Draw the background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);

        // Draw stars
        Random rand = new Random();
        g.setColor(Color.WHITE);
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt(800);
            int y = rand.nextInt(600);
            g.fillRect(x, y, 2, 2); // Draw small white squares as stars
        }
    }
    
    private static void drawRocket(Graphics g) {
        // Draw the rocket body
        g.setColor(Color.GRAY);
        g.fillRect(150, 100, 100, 200);

        // Draw the rocket nose
        g.setColor(Color.RED);
        int[] xPoints = {200, 220, 180};
        int[] yPoints = {100, 50, 50};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw the rocket's fins
        g.setColor(Color.GRAY);
        g.fillRect(160, 300, 20, 30);
        g.fillRect(220, 300, 20, 30);

        // Draw the rocket's flames
        g.setColor(Color.ORANGE);
        g.fillRect(180, 300, 40, 50);
    }
    
    private static void drawPlanet(Graphics g) {
        g.setColor(Color.RED);
        g.drawArc(480, 280 , 250, 50, 0, 180);
        g.setColor(new Color(150, 150, 255)); // Blue-gray color
        g.fillOval(500, 200, 200, 200); // Position (100, 100) and size (200x200)

        // Draw some features or details on the planet
        // (You can customize these to represent specific features)
        g.setColor(Color.RED); // For example, red features
        g.fillOval(550, 250, 20, 20); // Position (150, 150) and size (20x20)
        g.fillOval(600, 280, 15, 15);// Position (200, 180) and size (15x15)
        g.setColor(new Color(0,0,204));
        g.drawArc(480, 280 , 250, 50, 180, 200);
    }
}
