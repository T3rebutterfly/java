package sem5;

import java.applet.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Daalgavar extends Applet {
    private Color currentColor = Color.BLACK;
    private List<String> shapeData = new ArrayList<>();

    public void paint(Graphics g) {
        g.setColor(currentColor);
        while (true) {
            int shapeType = getUserInput();

            switch (shapeType) {
                case 1:
                    g.drawLine(10, 10, 50, 10);
                    g.drawOval(70, 10, 50, 50);
                    g.drawRect(140, 10, 100, 50);
                    g.drawOval(70, 70, 50, 80);
                    g.drawRect(140, 70, 50, 50);
                    break;
                case 2:
                    g.drawLine(10, 10, 250, 10);
                    break;
                case 3:
                    g.drawOval(10, 10, 150, 150);
                    break;
                case 4:
                    g.drawRect(10, 10, 250,100);
                    break;
                case 5:
                    g.drawOval(10, 10, 150, 80);
                    break;
                case 6:
                    g.drawRect(10, 10, 150, 150);
                    break;
                case 7:
                    g.clearRect(0, 0, getWidth(), getHeight());
                    break;
                case 8:
                    changeColor();
                    break;
                case -1:
                    return;
            }
        }
    }

    private int getUserInput() {
        String input = JOptionPane.showInputDialog("1: buh object\n" + "2: shuluun\n" + "3: toirog\n"
                    + "4: tegsh ontsogt\n" + "5: zuuvan\n" + "6: kvadrat\n"
                    + "7: butsah\n" + "8: ongo songono\n" + "-1: programas garna\n");
        
        if (input != null) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return -1;
    }

    private void changeColor() {
        String input = JOptionPane.showInputDialog("Ongoo songo: ");
        if (input != null) {
            try {
                Color newColor = (Color) Color.class.getField(input.toUpperCase()).get(null);
                currentColor = newColor;
                repaint(); 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid color name.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
