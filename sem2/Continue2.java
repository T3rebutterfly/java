package sem2;

public class Continue2 {
    
    public static void main (String argsp[])
    {
        int i = 0;
        while(i<=3)
        {
            System.out.print(i);
            i++;
            if(i%2==0)continue;
            System.out.println("tegsh too");
        }
        System.out.println("togsov");
    }
}
