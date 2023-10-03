package sem5;

public class Point3 extends Shape{
    
    private int x;
    private int y;
    
    public Point3()
    {
        
    }
    
    public Point3(int xValue, int yValue)
    {
        x = xValue;
        y = yValue;
    }
    
    public void setX(int xValue)
    {
        x = xValue;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setY(int yValue)
    {
        y = yValue;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getName()
    {
        return "Point";
    }
    
    public String toString()
    {
        return "[" + getX() + "," + getY() + "]";
    }

    double getRadius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRadius(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getDiameter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getCircumference() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
