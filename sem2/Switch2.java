package sem2;

import javax.swing.JOptionPane;

public class Switch2 {
    
    public static void main(String[] args)
    {
        String numberString;
        int number;
        numberString = JOptionPane.showInputDialog("Enter birth month (1-12):");
        number = Integer.parseInt(numberString);
        switch(number){
            case 12: System.out.println("Ovol"); break;
            case 1: System.out.println("Ovol"); break;
            case 2: System.out.println("Ovol"); break;
            case 3: System.out.println("Havar"); break;
            case 4: System.out.println("Havar"); break;
            case 5: System.out.println("Havar"); break;
            case 6: System.out.println("Zun"); break;
            case 7: System.out.println("Zun"); break;
            case 8: System.out.println("Zun"); break;
            case 9: System.out.println("Namar"); break;
            case 10: System.out.println("Namar"); break;
            case 11: System.out.println("Namar"); break;
            default: System.out.println("1-12 hoorondoh too oruulna");break;
            }
        System.exit(0);
    }
}
