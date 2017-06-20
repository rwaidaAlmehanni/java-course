package com.company;

/**
 * Created by Rwaida on 6/20/2017.
 */
public enum birthDay {
    moh("Eman","22"),
    Ahm("Sara","25"),
    Alaa("Rana","30");
    private final String name;
    private final String birth;

    birthDay(String WName,String WAge){
        name=WName;
        birth=WAge;
    }

    public String getName(){
        return name;
    }
    public String getBirth(){
        return birth;
    }
}
