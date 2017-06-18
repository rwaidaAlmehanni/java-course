package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("enter the grade of your subjects to get the avg of them :");
         double grad;
         int i=0,total=0,counter=0;
         while(i<7){
             grad=input.nextDouble();
             total+=grad;
             i++;
             ++counter;
         }
         System.out.println("your total is :");
         System.out.println(total/counter);


    }
}
