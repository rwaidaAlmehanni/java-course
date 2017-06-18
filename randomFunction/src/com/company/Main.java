package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random x=new Random();
        int n;
        for (int i=0;i<10;i++){
            //between 0 & 4 it will generate 10 numbers >>>
            n=x.nextInt(5);
            System.out.println(n);
                }
    }
}
