package sem3;

public class ArgumentDemo1 {
    
    public static void sub(int x) 
    {
        System.out.println("x = " + x);
        x = x + 1;
        System.out.println("x = " + x);
    }
    
    public static void main(String[] args) 
    {
        int z = 12;
        System.out.println("z = " + z);
        sub(z);
        System.out.println("z = " + z);
    }
}
