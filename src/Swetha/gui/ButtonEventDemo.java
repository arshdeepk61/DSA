package Swetha.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventDemo extends Frame implements ActionListener {
    Button b;

    public ButtonEventDemo(){
       b=new Button("Click Me");
       b.addActionListener(this);

       add(b);
       setSize(300,200);
       setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button is clicked");
    }

    public static void main(String[] args) {
        new ButtonEventDemo();
    }
}
