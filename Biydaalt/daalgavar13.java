/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;
//Гараас өгсөн n тооны цифрүүдийн нийлбэр нь ямар нэгэн бүхэл тооны
//квадрат ‘мөн’ эсэхийг шалга.
public class daalgavar13 {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("N toog oruul: ");
        int n = d.nextInt();
        int digit;
        int sum = 0;
        while(n>0)
        {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Tsipruudiin niilber: " + sum);
        double sqrt = Math.sqrt(sum);
        if(sqrt - Math.floor(sqrt)==0)
        {
            System.out.println("Buhel toonii kvadrat mon");
        }
        else
        {
            System.out.println("Buhel toonii kvadrat bish");
        }
    }
}
