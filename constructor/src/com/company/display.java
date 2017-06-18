package com.company;

/**
 * Created by Rwaida on 6/18/2017.
 */
public class display {
    private String girle;
    public display(String name){
        girle=name;
    }
    public void displaymess(String name){
        girle=name;
    }
    public String givename(){
        return girle;
    }
    public void printname(){
        System.out.printf("miss beautiful time with you :%s",givename());
    }
}