/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daalgavar;

import java.util.Scanner;

class Syragch {
    public String owog;
    public String name;
    public int age;

    public void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Owog: ");
        owog = scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.println("\n\n");
        System.out.println("Owog: " + owog + "\nName: " + name + "\nAge: " + age + "\n\n");
    }
}

public class Suragch {
    public static void main(String[] args) {
        final int clas = 2;
        Syragch tr = new Syragch();
        int s = 0;
        int v = 0;
        int avg;

        for (int i = 0; i < clas; ++i) {
            tr.print();
            s = s + tr.age;
            v++;
        }

        avg = s / v;
        System.out.println("Dundaj nas = " + avg);
    }
}
