package sem3;

import java.util.Scanner;

public class Daalgavar2 {
    
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, OddSum = 0;
		sc = new Scanner(System.in);	 
		System.out.print(" heden element orulah ve : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];		
		System.out.print(" Toogoo oruul " + Size + " massiviin elementuud  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		OddSum = SumOfOddsinArray(a, Size);
		System.out.println("\n Ene massivdahi sondgoi toonii niilber = " + OddSum);
	}
	public static int SumOfOddsinArray(int[] a, int Size)
	{
		int i, OddSum = 0;		
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 != 0)
			{
				OddSum = OddSum + a[i]; 
			}
		}	
		return OddSum;
	}
}