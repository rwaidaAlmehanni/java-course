package com.company;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

/**
 * Created by Rwaida on 6/21/2017.
 */
public class newWindow extends JFrame {

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField itemp;

    public newWindow() {
        super("Input Data");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("enter the text here");
        add(item2);

        item3 = new JTextField("xxxxx", 20);
        add(item3);

        itemp = new JPasswordField("uneditbale");
        add(itemp);
        //to add event that open another page display what you write...
        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        itemp.addActionListener(handler);
    }

    private class thehandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String s = "";
            if (event.getSource() == item1) {

                s = String.format("field 1: %s", event.getActionCommand());
            } else if (event.getSource() == item2) {

                s = String.format("field 2 : %s", event.getActionCommand());
            } else if (event.getSource() == item3) {

                s = String.format("field 3: %s", event.getActionCommand());
            } else if (event.getSource() == itemp) {

                s = String.format("password field : %s", event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null,s);
        }
    }
}



