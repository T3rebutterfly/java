package sem6;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class OptionPane {
    
    public static void main(String[] args){
        
        boolean continueLoop = true;
        
        do
        {
            try
            {
                String numberString1 = JOptionPane.showInputDialog("Enter first integer:");
                int number1 = Integer.parseInt(numberString1);
                String numberString2 = JOptionPane.showInputDialog("Enter second integer:");
                int number2 = Integer.parseInt(numberString2);
                
                int result = huvaah(number1, number2);
                System.out.println("\nResult: " + result);
                continueLoop = false;
            }
            catch(InputMismatchException e)
            {
                JOptionPane.showMessageDialog(null, "Integer number is required!");
            }
            catch(ArithmeticException e)
            {
                JOptionPane.showMessageDialog(null, "Arithmetic exception: Dividy by zero!");
            }
        }while(continueLoop);
    }
    private static int huvaah(int hurtver, int huvaari)
    {
        return hurtver / huvaari;
    }
}
