/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;
import java.lang.Math;
//Гараас өгсөн n зэргээр a-тай харгалзах тухайн тооны зэргийг олох бодлого. 
public class daalgavar4 {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("A toog oruul: ");
        int a = d.nextInt();
        
        Scanner e = new Scanner(System.in);
        System.out.print("N toog oruul: ");
        int n = e.nextInt();
        
        int square = (int) Math.pow(a,n);
        System.out.println("Hariu: " + square);
    }
}
