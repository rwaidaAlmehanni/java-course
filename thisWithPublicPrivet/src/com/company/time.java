package com.company;

/**
 * Created by Rwaida on 6/19/2017.
 */
public class time {
    private int hour=1;
    private int minute=2;
    private int second=3;
    public void setTime(int hour,int minute,int second){
        this.hour=4;
        this.minute=5;
        this.second=6;
    }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d ",hour,minute,second);
    }
    public String toString(){
        return String.format("%02d:%02d:%02d %s",((hour==0 || hour==12 )? 12:hour),minute,second,(hour<12 ? "Am":"pm"));
    }
}
