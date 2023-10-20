/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;
//Гараас өгөгдсөн n хүртэлх тоонуудын дунджийг олох бодлого
public class daalgavar3 {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("N toog oruul: ");
        int n = d.nextInt();
        
        int s = 0;
        
        for(int i = 0; i <= n; i++)
        {
            s += i;
        }
        int average = s / n;
        System.out.println("Dundaj bol: " + average);
    }
}
