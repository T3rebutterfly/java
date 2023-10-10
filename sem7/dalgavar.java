package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;

public class dalgavar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mountain Scene");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300); // Set the frame size

        // Create a JPanel to draw the scene
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawScene(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    // Method to draw the entire scene
    private static void drawScene(Graphics g) {
        drawSky(g);
        drawSun(g);
        drawRainbow(g);
        drawMountain(g);
        drawCar(g);
        ger(g);
    }

    // Method to draw the sky
    private static void drawSky(Graphics g) {
        g.setColor(new Color(135, 206, 250)); // Light Sky Blue
        g.fillRect(0, 0, 800, 400);
    }
    
    // Method to draw the sun
    private static void drawSun(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(400, 30, 80, 80);
    }
    
    // Method to draw the rainbow
    private static void drawRainbow(Graphics g) {
        int x = 50; // X-coordinate for the top-left corner of the bounding box
        int y = 60; // Y-coordinate for the top-left corner of the bounding box
        int width = 300; // Width of the bounding box
        int height = 200; // Height of the bounding box

        // Define colors for the rainbow
        Color[] rainbowColors = {
            Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.BLUE, new Color(75, 0, 130), new Color(148, 0, 211)
        };

        // Draw the rainbow
        for (Color rainbowColor : rainbowColors) {
            g.setColor(rainbowColor);
            g.fillArc(x, y, width, height, 0, 180);
            // Decrease the height to create the next arc
            height -= 20;
            // Increase the Y-coordinate to move to the next arc
            y += 10;
        }
    }
    
    // Method to draw a single mountain-like shape
    private static void drawMountain(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{-50, 10, 130}, new int[]{200, 100, 200}, 3);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{0, 70, 170}, new int[]{200, 100, 200}, 3);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{50, 150, 250}, new int[]{200, 50, 200}, 3);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{150, 250, 350}, new int[]{200, 70, 200}, 3);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{250, 350, 450}, new int[]{200, 100, 200}, 3);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{350, 450, 550}, new int[]{200, 130, 200}, 3);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{450, 550, 650}, new int[]{200, 100, 200}, 3);// Triangle for the mountain
        g.setColor(Color.GREEN); // 
        g.fillRect(0, 200, 800, 80);
        g.setColor(Color.BLUE); // 
        g.fillRect(0, 170, 800, 30);
        }
    
    // Method to draw a car
    private static void drawCar(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(50, 180, 80, 40);

        // Draw the car windows
        g.setColor(Color.CYAN);
        g.fillRect(60, 190, 30, 15);
        g.fillRect(100, 190, 25, 15);

        // Draw the car wheels
        g.setColor(Color.BLACK);
        g.fillOval(60, 210, 20, 20);
        g.fillOval(100, 210, 20, 20);
    }
    
    //ger
    private static void ger(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillArc(300, 180, 50, 50, 0, 180);
        g.fillRect(300, 200, 50, 50);
        g.setColor(Color.BLACK);
        g.fillRect(325, 165, 5, 30);
        g.setColor(Color.ORANGE);
        g.fillRect(325, 210, 15, 30);
    }
}