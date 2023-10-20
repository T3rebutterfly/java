/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biydaalt;

import java.util.*;
import java.lang.Math;
//[50,155] гэсэн завсарт орших 3-т хуваагддаг бүх тоонуудын
//нийлбэр,нийлбэрээс авсан язгуурыг олсон бодлого
public class daalgavar8 {
    public static void main(String[] args)
    {
        int i = 50;
        int s = 0;
        while(i <= 155)
        {
            if(i%3==0)
            {
                s += i;
            }
            i++;
        }
        System.out.println("3t huvaagddag toonuudiin niilber: " + s);
        System.out.println("Niilberees avsan yzguur: " + Math.sqrt(s));
    }
}
