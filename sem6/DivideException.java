package sem6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideException {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        
        do
        {
            try
            {
                System.out.print("Please enter first integer number:");
                int hurtver = scanner.nextInt();
                System.out.print("Please enter second integer number:");
                int huvaari = scanner.nextInt();
                
                int result = huvaah(hurtver, huvaari);
                System.out.println("\nResult: " + result);
                continueLoop = false;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Buruu utga.");
                scanner.nextLine();
                System.out.println("Too oruulah yostoi.");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic aldaa.");
            }
        }while(continueLoop);
    }
    private static int huvaah(int hurtver, int huvaari)
    {
        return hurtver / huvaari;
    }
}
