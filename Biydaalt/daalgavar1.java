/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;
//1 ээс n хүртэлх тоонуудын тэгш тоонуудын үржвэрийг ол
public class daalgavar1 {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("N toog oruul: ");
        int n = d.nextInt();
        
        int s = 1;
        System.out.print("Tanii hariu: ");
        for(int i = 1; i <= n; i++)
        {
            if(i%2==0)
            {
                s *= i;
                
            }
        }
        System.out.println(s);
    }
}
