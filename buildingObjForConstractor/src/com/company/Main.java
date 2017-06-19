package com.company;
public class Main {

    public static void main(String[] args) {
        time x1=new time();
        time x2=new time(1);
        time x3=new time(1,2);
        time x4=new time(1,2,3);
        System.out.printf("%s\n",x1.toMilitary());
        System.out.printf("%s\n",x2.toMilitary());
        System.out.printf("%s\n",x3.toMilitary());
        System.out.printf("%s\n",x4.toMilitary());
    }

}
