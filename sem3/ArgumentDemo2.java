package sem3;

public class ArgumentDemo2 {
    
    public static void sub(String m) 
    {
        System.out.println("Function dotor ehleed: " + m);
        m = "C++";
        System.out.println("Function dotor daraaa ni: " + m);
    }
    public static void main(String[] args) 
    {
        String m = "Java";
        System.out.println("Damjuulahin omno: " + m);
        sub(m);
        System.out.println("damjuulsanii daraa: " + m);
    }
}
