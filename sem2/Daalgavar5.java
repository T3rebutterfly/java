package sem2;

public class Daalgavar5 {
    
    public static void main (String args[])
    {
        int i = 0;
        boolean anhToo;
        do{
            i++;
            anhToo = true;
            for(int x = 2; x <= i/2; x++)
                if(i % x == 0)anhToo = false;
            if(anhToo)System.out.println(i);
        }while(i<=1000);
    }
}
