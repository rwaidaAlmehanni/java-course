package com.company;
public class Main {

    public static void main(String[] args) {
        System.out.println(avrage(60,70,83,56,90,86,66));


    }
    public static int avrage(int ...arg){
        int total=0;
        for (int i:arg){
            total+=i;
            }
          return total/arg.length;

        }

}
