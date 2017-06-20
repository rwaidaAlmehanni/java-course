package com.company;

/**
 * Created by Rwaida on 6/20/2017.
 */
public class birthDay {

    private  int sum;
    private  final int  NUMBER;


    public birthDay(int b){
        NUMBER=b;
    }
    public void add(){
        sum+=NUMBER;
    }
    public String toString(){
        return String.format("sum= %d\n",sum);
    }


}
