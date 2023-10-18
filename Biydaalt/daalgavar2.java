/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;

public class daalgavar2 {
     public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("N toog oruul: ");
        int n = d.nextInt();
        
        float s = 0;
        float z = 1;
        for(int i = 1; i <= n; i++)
        {
            if(i%2==0)
            {
                s += i;
                System.out.println("tegsh toonii niilber: " + s);
            }
            if(i%2!=0)
            {
                z *= i;
                System.out.println("sondgoi toonii urjver: " + z);
            }
        }
    }
}
