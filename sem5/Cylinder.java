package sem5;

public class Cylinder extends Circle4{
    private double height;
    
    public Cylinder()
    {
        
    }
    
    public Cylinder(int x, int y, double radius, double heightValue)
    {
        super(x, y, radius);
        setHeight(heightValue);
    }
    
    public void setHeight(double heightValue)
    {
        height = ( heightValue < 0.0 ? 0.0 : heightValue);
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getArea()
    {
        return 2 * super.getArea() + getCircumference() * getHeight();
    }
    
    public double getVolume() 
    {
        return super.getArea() * getHeight();
    }
    
    public String getName()
    {
        return "Cylinder";
    }
    
    public String toString() 
    {
        return super.toString() + "; Height = " + getHeight();
    }
}
