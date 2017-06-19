package com.company;
public class Main {

    public static void main(String[] args) {
        int y[] = {3, 5, 22};
        change(y);
        for (int i : y) {
            System.out.println(i);
        }
    }
    public static void change(int x[]){
        for(int counter=0;counter<x.length;counter++){
            x[counter]+=5;
        }
    }
}
