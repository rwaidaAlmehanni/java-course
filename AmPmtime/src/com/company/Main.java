package com.company;
public class Main {

    public static void main(String[] args) {
        time x=new time();
        System.out.println(x.toMilitary());
        x.setTime(22,13,6);
        System.out.println(x.toMilitary());

    }

}
