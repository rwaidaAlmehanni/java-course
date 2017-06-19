package com.company;
public class Main {

    public static void main(String[] args) {
        int x[][]={{1,2,3},{4,5,6}};
        int y[][]={{1,2,3},{4},{5,3,4,2}};
        System.out.println("this is the first array : ");
        display(x);
        System.out.println("this is the second array : ");
        display(y);
    }
    public static void display(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
            
        }
    }
}
