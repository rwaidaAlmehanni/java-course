package com.company;

/**
 * Created by Rwaida on 6/18/2017.
 */
public class display {
    private String girle;
    public void displaymess(String name){
        girle=name;
    }
    public String givename(){
        return girle;
    }
    public void printname(){
        System.out.printf("beautifull girl call :%s",givename());
    }
}