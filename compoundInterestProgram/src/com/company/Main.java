package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     double amounte,principle=1000,rate=.01;
     for (int day=1;day<=20;day++){
         amounte=principle*Math.pow(1+rate,day);
         System.out.println(day+"   "+amounte);
     }
    }
}
