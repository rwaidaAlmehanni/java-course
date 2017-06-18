package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
           display x=new display();
           Scanner input= new Scanner(System.in);
           System.out.println("enter your name :");
           x.displaymess(input.nextLine());
           x.printname();

    }
}
