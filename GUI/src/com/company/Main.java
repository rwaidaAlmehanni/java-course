package com.company;
import java.util.EnumSet;
import javax.swing.JOptionPane;
import static java.lang.String.*;

public class Main {

    public static void main(String[] args) {
         String fn=JOptionPane.showInputDialog("Enter the first number ");
         String sn=JOptionPane.showInputDialog("Enter the second number ");

         int num1=Integer.parseInt(fn);
         int num2=Integer.parseInt(sn);
         int sum = num1+num2;
        JOptionPane.showMessageDialog(null,"the answer is "+sum,"the titel",JOptionPane.PLAIN_MESSAGE);

       }

}
