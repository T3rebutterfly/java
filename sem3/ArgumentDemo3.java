package sem3;

public class ArgumentDemo3 {
    
    public static void sub(String[] s) 
    {
        System.out.println("Function dotor ehleed: " + s[0] + " " + s[1]);
        s[0] = "C";
        s[1] = "is procedural.";
        System.out.println("Function dotor daraaa ni: " + s[0] + " " + s[1]);
    }
    
    public static void main(String[] args) 
    {
        String[] m = {"Java", "is object oriented."};
        System.out.println("Damjuulahin omno: " + m[0] + " " + m[1]);
        sub(m);
        System.out.println("Damjuulsanii daraa: " + m[0] + " " + m[1]);
    }
}
