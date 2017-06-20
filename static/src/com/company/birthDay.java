package com.company;

/**
 * Created by Rwaida on 6/20/2017.
 */
public class birthDay {

    private  String desc;
    private  String birth;
    private static int x=0;

    public birthDay(String d,String b){
        x++;
        desc=d;
        birth=b;
        System.out.printf("%s \t %s "+x+"\n",desc,birth);
    }


}
