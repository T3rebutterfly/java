package sem2;

import javax.swing.JOptionPane;

public class Switch1 {
    
    public static void main(String[] args)
    {
        String numberString;
        int number;
        numberString = JOptionPane.showInputDialog("Enter number (0-9):");
        number = Integer.parseInt(numberString);
        switch(number){
            case 0 : System.out.println("TEG"); break;
            case 1 : System.out.println("NEG"); break;
            case 2 : System.out.println("HOYOR"); break;
            case 3 : System.out.println("GURAV"); break;
            case 4 : System.out.println("DOROV"); break;
            case 5 : System.out.println("TAV");break;
            case 6 : System.out.println("ZURGAA"); break;
            case 7 : System.out.println("DOLOO"); break;
            case 8 : System.out.println("NAIM"); break;
            case 9 : System.out.println("ES"); break;
            default: System.out.println("1-9 hoorondoh too oruulna.");break;
            }
        System.exit(0);
    }
}
