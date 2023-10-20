/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;
//[ a, b] завсарт орших бүх тэгш тоонуудын нийлбэрийг ол.
public class daalgavar7 {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("A toog oruul: ");
        int a = d.nextInt();
        
        Scanner e = new Scanner(System.in);
        System.out.print("B toog oruul: ");
        int b = e.nextInt();
        
        int s = 0;
        System.out.print("Tanii hariu: ");
        while(a <= b)
        {
            if(a%2==0)
            {
                s += a;
            }
            a++;
        }
        System.out.println(s);
    }
}
