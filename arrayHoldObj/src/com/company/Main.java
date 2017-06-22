package com.company;
import java.util.EnumSet;
import javax.swing.JFrame;
import static java.lang.String.*;

public class Main {

    public static void main(String[] args) {
          AnimalList x=new AnimalList();//declare array that this class generate
          Dog d=new Dog();//declare one item
          Fish f=new Fish();
          x.add(d);//push the item to the array
          x.add(f);

       }

}
