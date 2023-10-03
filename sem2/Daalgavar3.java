package sem2;

public class Daalgavar3 {
    
    public static void main (String args[])
    {
        int N = 10;
        int i = 0;
        System.out.print("garaas ogson too " + N + " tegsh too = ");
        do
        {   
            if(i%2==0)
            System.out.print(i+ " ");
            i = i + 1;
        }while(i <= N);
        System.out.println();
    }
}
