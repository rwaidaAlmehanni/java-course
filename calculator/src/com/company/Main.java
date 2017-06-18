package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double y,z;
        System.out.println("enter the first number :");
        y=x.nextDouble();
        System.out.println("enter the second number :");
        z=x.nextDouble();
        System.out.print(y+z);
    }
}
