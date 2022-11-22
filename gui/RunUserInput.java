package edu.aqmal.gui;

import javax.swing.*;

public class RunUserInput {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("User Input");
        jFrame.setContentPane(new UserInput().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600,500);
        jFrame.setVisible(true);
    }
}
