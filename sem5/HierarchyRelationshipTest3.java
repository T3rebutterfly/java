package sem5;

public class HierarchyRelationshipTest3 {
    
    public static void main (String[] args)
    {
        Point3 point;
        Circle4 circle = new Circle4(120, 89, 2.7);
        
        point = circle;
        
        int x = point.getX();
        int y = point.getY();
        point.setX(10);
        point.setY(20);
        point.toString();
        
        double radius = point.getRadius();
        point.setRadius(33.33);
        double diameter = point.getDiameter();
        double circumference = point.getCircumference();
        double area = point.getArea();
    }
}
