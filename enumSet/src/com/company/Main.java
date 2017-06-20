package com.company;
import java.util.EnumSet;
public class Main {

    public static void main(String[] args) {
        for (birthDay x: EnumSet.range(birthDay.Ahm,birthDay.soso)){
            System.out.printf("%s\t %s \t %s\n",x,x.getDesc(),x.getBirth());
        }

    }

}
