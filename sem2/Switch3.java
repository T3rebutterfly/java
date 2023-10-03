package sem2;

import javax.swing.JOptionPane;

public class Switch3 {
    
    public static void main(String[] args)
    {
        String numberString;
        int number;
        numberString = JOptionPane.showInputDialog("Enter birth month (1-12):");
        number = Integer.parseInt(numberString);
        switch(number){
            case 12: case 1: case 2 : System.out.println("Ovol"); break;
            case 3: case 4: case 5 : System.out.println("Havar"); break;
            case 6: case 7: case 8 : System.out.println("Zun"); break;
            case 9: case 10: case 11 : System.out.println("Namar"); break;
            default: System.out.println("1-12 hoorondoh too oruulna"); break;
        }
    System.exit(0);
    }
}
