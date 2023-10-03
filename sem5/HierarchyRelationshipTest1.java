package sem5;

import javax.swing.JOptionPane;


public class HierarchyRelationshipTest1 {
 
    public static void main (String[] args)
    {
        Point3 point = new Point3(30, 50);
        
        Circle4 circle = new Circle4(120, 89, 2.7);
        
        String output = "Call Point3's toString with superclass" + " reference to superclass object: \n" +point.toString();
        output += "\n\nCall Circle4's toString with subclass" + "refrence to subcalss object: \n" + circle.toString();
        
        Point3 pointRef = circle;
        output += "\n\nCall Circle4's toString with superclass" + " reference to subclass object: \n" + pointRef.toString();
        
        JOptionPane.showMessageDialog(null, output);
        
        System.exit(0);
    }
}
