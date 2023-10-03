package sem5;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class AbstractInheritanceTest {
    
    public static void main(String args[])
    {
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        
        Point3 point  = new Point3(7, 11);
        Circle4 circle = new Circle4(22, 8, 3.5);
        Cylinder cylinder = new Cylinder(20, 30, 3.3, 10.75);
        
        String output = point.getName() + ": " + point + "\n" + circle.getName() + ": " + circle + "\n" + cylinder.getName() + ": " + cylinder + "\n";
        
        Shape arrayOfShapes[] = new Shape[3];
        arrayOfShapes[ 0 ] = point;
    
        arrayOfShapes[ 1 ] = circle;

        arrayOfShapes[ 2 ] = cylinder;

        for ( int i = 0; i < arrayOfShapes.length; i++ )
        {
            output += "\n\n" + arrayOfShapes[ i ].getName() + ": " +  arrayOfShapes[ i ].toString() + "\nArea = " + twoDigits.format( arrayOfShapes[ i ].getArea() ) + "\nVolume = " + twoDigits.format( arrayOfShapes[ i ].getVolume() );
        }

        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
    }
}

