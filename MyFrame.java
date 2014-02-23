package labb2;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        MyButton myButton = new MyButton();
        myButton.setPreferredSize(new Dimension(100, 100));
        myButton.addActionListener(myButton);

        myFrame.add(myButton);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}