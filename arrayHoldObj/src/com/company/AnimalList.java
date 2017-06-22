package com.company;

/**
 * Created by Rwaida on 6/22/2017.
 */
public class AnimalList {
    private Animal[] thelist=new Animal[5];
    private int i=0;
    public void add(Animal a ){
        if(i<thelist.length){
            thelist[i]=a;
            System.out.println("the animal saved in the index :"+i);
            i++;
        }
    }
}
