package com.company;

/**
 * Created by Rwaida on 6/19/2017.
 */
public class time {
    private int hour;
    private int minute;
    private int second;
    public void setTime(int h,int m,int s){
        hour=((h>=0 && h<=24) ? h:0);
        minute=((m>=0 && m<=60) ? m:0);
        second=((s>=0 && s<=60) ? s:0);
    }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d %s",((hour==0 || hour==12 )? 12:hour),minute,second,(hour<12 ? "Am":"pm"));
    }
}
