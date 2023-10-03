package sem3;

public class function1 {
    
    public static int cube(int x)
    {
        return x * x * x;
    }
    public static void main ( String args[] )
    {
        for(int i = 1; i < 100; i++)
            System.out.println(cube(i));
    }
}
