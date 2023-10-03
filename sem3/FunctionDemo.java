package sem3;

public class FunctionDemo {
    
    public int cube(int x)
    {
        return x * x * x;
    }
    public static void main (String args[])
    {
        FunctionDemo myObject = new FunctionDemo();
        for(int i = 1; i < 100; i++)
            System.out.println(myObject.cube(i));
    }
}
