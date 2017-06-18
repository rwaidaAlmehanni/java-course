package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter number to generate even numbers between 0 and it :");
        double y=x.nextDouble();
        for(int i=0; i<y;i+=2)
         System.out.println(i);
    }
}
