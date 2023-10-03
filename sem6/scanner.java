package sem6;

import java.util.Scanner;

public class scanner {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        String s;
        double d;
        int i;
            
            s = input.next();
            System.out.println(s);
            
            d = input.nextDouble();
            System.out.println(d);
            
            i = input.nextInt();
            System.out.println(i);  
    }
}
