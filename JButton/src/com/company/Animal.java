package com.company;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by Rwaida on 6/22/2017.
 */
public class Animal extends JFrame{
    private JButton x;
    private JButton y;
    public  Animal(){
        super("test button");
        setLayout(new FlowLayout());

        x=new JButton("new button");
        add(x);
        Icon b=new ImageIcon(getClass().getResource("b.png"));
        Icon a=new ImageIcon(getClass().getResource("x.png"));
        y=new JButton("Custom",b);
        y.setRolloverIcon(a);
        add(y);

        handlerClass handler =new handlerClass();
        x.addActionListener(handler);
        y.addActionListener(handler);
    }
    private class handlerClass implements ActionListener {
        public void actionPreformeds(ActionEvent event){
            JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
        }

    }

}
