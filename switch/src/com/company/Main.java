package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String  y;
            y=x.nextLine();
        switch (y) {
            case "a":
                System.out.println("1");
                break;
            case "b":
                 System.out.println("2");
                 break;
            default:
                System.out.print("no one");
                break;
        }
    }
}
