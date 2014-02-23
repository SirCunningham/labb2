package labb2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame2 implements ActionListener {

    private JFrame myFrame;
    private MyButton2 myButton;

    public MyFrame2() {
        myFrame = new JFrame();
        myButton = new MyButton2();
        myButton.setPreferredSize(new Dimension(100, 100));
        myButton.addActionListener(this);

        myFrame.add(myButton);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myButton.toggleState();
    }
}