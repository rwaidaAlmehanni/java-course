package com.company;

/**
 * Created by Rwaida on 6/19/2017.
 */
public class time {
    private int day;
    private int month;
    private int year;
   public time(int d,int m,int y){
       day=d;
       month=m;
       year=y;
       System.out.printf("the constructor for this is %s\n",this);
   }
    public String toString(){
        return String.format("%02d/%02d/%02d",day,month,year);
    }
}
