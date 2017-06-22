package com.company;
import java.util.EnumSet;
import javax.swing.JFrame;
import static java.lang.String.*;

public class Main {

    public static void main(String[] args) {
       Animal[]  thelist=new Animal[2];
       Dog d=new Dog();
       Fish f=new Fish();
       thelist[0]=d;
       thelist[1]=f;
       for(Animal x:thelist){
           x.name();
       }

       }

}
