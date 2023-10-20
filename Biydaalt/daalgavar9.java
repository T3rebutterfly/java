/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;
//1!+2!+3!...............n! –ийн нийлбэрийг олох бодлого. 
public class daalgavar9 {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("N toog oruul: ");
        int n = d.nextInt();
       
        int fact = 1;
        int sum = 0;
        System.out.print("factorial iin niilberiin hariu: ");
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
            sum += fact;
            
        }
        System.out.println(sum);
    }
}
