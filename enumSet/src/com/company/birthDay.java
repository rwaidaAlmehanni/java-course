package com.company;

/**
 * Created by Rwaida on 6/20/2017.
 */
public enum birthDay {
    moh("smart","22"),
    Ahm("rash","25"),
    Alaa("creative","30"),
    salem("kind","45"),
    soso("prity","23"),
    roro("amazing","20");

    private final String desc;
    private final String birth;

    birthDay(String d,String b){
        desc=d;
        birth=b;
    }

    public String getDesc(){
        return desc;
    }
    public String getBirth(){
        return birth;
    }
}
