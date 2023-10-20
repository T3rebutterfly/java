/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;
//1-ээс n хүртэлх сондгой тоонуудын нийлбэр,нийлбэрийн дунджийг ол.
public class daalgavar10 {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("N toog oruul: ");
        int n = d.nextInt();
        int j = 0;
        int s = 0;
        for(int i = 0; i <= n; i++)
        {
            if(i%2!=0)
            {
                s += i;
                j++;
            }
        }
        System.out.println("Sondgoi toonuudiin niilber: " + s);
        float average = s / j;
        System.out.println("Niilberiin dundaj bol: " + average);
    }
}
