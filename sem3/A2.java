package sem3;

public class A2 {
    
    public static void s1()
    {
        System.out.println("s1");
    }
    public void a1() 
    {
        System.out.println("a1");
    }
    public static void main(String args[]) 
    {
        s1();
        B x = new B();
        x.b1();
    }
}
    class B
    {
        public void b1() 
        {
            System.out.println("b1");
            A2.s1();
            b2();
        }
        public void b2() 
        {
            System.out.println("b2");
            A2 mmm = new A2();
            mmm.a1();
        }
    }
