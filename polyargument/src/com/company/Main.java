package com.company;
import java.util.EnumSet;
import javax.swing.JFrame;
import static java.lang.String.*;

public class Main {

    public static void main(String[] args) {
           testClass a=new testClass();//new obj from testClass kind
           father x=new father();//new obj it is kind from the super class father
           father xch1=new chaild1();//new obj it is kind is from the subclass chaild1
           father xch2=new chaild2();//new obj it is kind from the subclass chaild2
           a.testfun(x);//function inside the testClass take the father class as an argument
           a.testfun(xch1);//function can also take the supclass from father as argument
           a.testfun(xch2);



       }

}
