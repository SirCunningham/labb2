package labb2;

import javax.swing.*;

public class MyApplet extends JApplet {

    @Override
    public void init() {
        MyButton myButton = new MyButton();
        myButton.addActionListener(myButton);
        add(myButton);
        setVisible(true);
    }
}