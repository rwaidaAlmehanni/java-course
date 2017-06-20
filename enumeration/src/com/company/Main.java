package com.company;
public class Main {

    public static void main(String[] args) {
        for (birthDay x:birthDay.values()){
            System.out.printf("%s\t %s \t %s\n",x,x.getName(),x.getBirth());
        }

    }

}
