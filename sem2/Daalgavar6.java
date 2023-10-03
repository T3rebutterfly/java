package sem2;

public class Daalgavar6 {
    
    public static void main(String args[])
    {
        int n = 10000, sum=0;
        for(int i = 1; i < n; i++)
        {
           for(int j = 1; j<=i - 1 ; j++)
           {
               if(i % j == 0)
               {
                   sum = sum + j;
                }
            }
           if(sum == i)
           {
             System.out.println(sum);  
            }
           sum = 0;
        }
    }
}
