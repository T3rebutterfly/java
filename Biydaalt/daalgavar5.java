/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;

public class daalgavar5 {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("N toog oruul: ");
        int n = d.nextInt();
        System.out.print("M toog oruul: ");
        int m = d.nextInt();
        
        System.out.print("tanii hariu: ");
        for(int i = 0; i < n; i++)
        {
            if(i%m==0)
            {
                System.out.print(i + ",");
            }
        }
    }
}
