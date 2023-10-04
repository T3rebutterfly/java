package sem6;

import java.util.Scanner;

public class Jishee {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("toologch: ");
            int num = in.nextInt();
            System.out.print("huwaagch: ");
            int di = in.nextInt();
            int result = num / di;
            System.out.println("huwaasan vr dvn: " + result);
        } catch (ArithmeticException e) {

            System.err.println("Error: 0 eer huwaaj bolohgui.");
        } catch (Exception e) {

            System.err.println("Error: " + e.getMessage());
        } finally {
    
            in.close();
        }
    }
}