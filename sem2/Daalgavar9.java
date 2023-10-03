package sem2;

import java.util.Scanner;

public class Daalgavar9 {

    public static void main(String[] args)
    {
		Scanner i = new Scanner(System.in);

		System.out.println("Enter a 4 digit number.");

		int n = i.nextInt();

		int digit4 = n%10;
		n = n/10;
		int digit3 = n%10;
		n = n/10;
		int digit2 = n%10;
		n = n/10;
		int digit1 = n%10;
		n = n/10;

		switch (digit1)
		{
		case 1: System.out.print("Neg ");break;
		case 2: System.out.print("Hoyr "); break;
		case 3: System.out.print("Gurav "); break;
		case 4: System.out.print("Dorov "); break;
		case 5: System.out.print("Tav "); break;
		case 6: System.out.print("Zurgaa "); break;
		case 7: System.out.print("Doloo "); break;
		case 8: System.out.print("Naim "); break;
		case 9: System.out.print("Es "); break;
		case 0: System.out.print("Teg "); break;
		default: System.out.print(""); break;
		}
		switch (digit2)
		{
		case 1: System.out.print("Neg ");break;
		case 2: System.out.print("Hoyr "); break;
		case 3: System.out.print("Gurav "); break;
		case 4: System.out.print("Dorov "); break;
		case 5: System.out.print("Tav "); break;
		case 6: System.out.print("Zurgaa "); break;
		case 7: System.out.print("Doloo "); break;
		case 8: System.out.print("Naim "); break;
		case 9: System.out.print("Es "); break;
		case 0: System.out.print("Teg "); break;
		default: System.out.print(""); break;
		}
		switch (digit3)
		{
		case 1: System.out.print("Neg ");break;
		case 2: System.out.print("Hoyr "); break;
		case 3: System.out.print("Gurav "); break;
		case 4: System.out.print("Dorov "); break;
		case 5: System.out.print("Tav "); break;
		case 6: System.out.print("Zurgaa "); break;
		case 7: System.out.print("Doloo "); break;
		case 8: System.out.print("Naim "); break;
		case 9: System.out.print("Es "); break;
		case 0: System.out.print("Teg "); break;
		default: System.out.print(""); break;
		}
		switch (digit4)
		{
		case 1: System.out.print("Neg ");break;
		case 2: System.out.print("Hoyr "); break;
		case 3: System.out.print("Gurav "); break;
		case 4: System.out.print("Dorov "); break;
		case 5: System.out.print("Tav "); break;
		case 6: System.out.print("Zurgaa "); break;
		case 7: System.out.print("Doloo "); break;
		case 8: System.out.print("Naim "); break;
		case 9: System.out.print("Es "); break;
		case 0: System.out.print("Teg "); break;
		default: System.out.print(""); break;
		}
	}
}
