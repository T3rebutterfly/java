package sem3;

public class Daalgavar1
{
   static int arr[] = { 1,1,1,1,1,1,1,1,1,1 };

    static int sum()
    {
        int sum = 0; 
        int i;
 
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("10 toonii niilber bol: " + sum());
    }
}