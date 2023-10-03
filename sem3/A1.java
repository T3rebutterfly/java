package sem3;

public class A1 {
    
    public static void s1()
    { 
        System.out.println("Function S1");
        s2(); 
        A1 y = new A1();
        y.a2(); 
    }
    public static void s2()
    {
        System.out.println("Function S2");
    }
    public void a1()
    {
        System.out.println("Function a1");
        s1();
        a2(); 
    }
    public void a2()
    {
        System.out.println("Function a2");
    }
    public static void main(String args[])
    {
        s1();
        A1 x = new A1();
        x.a1();
    }
}