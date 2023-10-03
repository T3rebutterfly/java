package sem1;
import javax.swing.JOptionPane;
public class daalgavar1 {
    public static void main(String args[])
    {
        int firstNumber;
        int secondNumber;
        int thirdNumber; 
     
        int sum; 
        double average; 
        double ih;
        double baga;
        String input; 
        String result; 

        input = JOptionPane.showInputDialog(null, "Enter First number: ");
        firstNumber=Integer.parseInt(input);
    
        input = JOptionPane.showInputDialog(null, "Enter Second number: ");
        secondNumber=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null, "Enter Thrid number: ");
        thirdNumber=Integer.parseInt(input);
    
        sum = firstNumber + secondNumber + thirdNumber;

        average = sum/3.0;

        result = "Average of " + firstNumber + ", " + secondNumber + " And " + thirdNumber +" is = " + average;
        
        ih=firstNumber;
        if(ih<secondNumber)
            ih=secondNumber;
        if(ih<thirdNumber)
            ih=thirdNumber;
        
        baga=firstNumber;
        if(baga>secondNumber)
            baga=secondNumber;
        if(baga>thirdNumber)
            baga=thirdNumber;
      
        JOptionPane.showMessageDialog(null, result, "Average of 3 Numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hamgiin ih: " + ih);
        JOptionPane.showMessageDialog(null,"Hamgiin baga: " + baga);
    }
}
