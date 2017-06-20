package com.company;

/**
 * Created by Rwaida on 6/20/2017.
 */
public class birthDay {
    private String name;
    private time birthDay;
    public birthDay(String n,time b){
        name=n;
        birthDay=b;

    }
    public String x(){
        return String.format("your name %s your birthday %s",name,birthDay);
    }
}
