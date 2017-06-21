package com.company;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Created by Rwaida on 6/21/2017.
 */
public class newWindow extends JFrame{

    private JLabel x;
    public newWindow(){
        super("the title of me :)");
        setLayout(new FlowLayout());
        x=new JLabel("this is the lable input");
        x.setToolTipText("this show when the mouse is over ");
        add(x);
    }

}
