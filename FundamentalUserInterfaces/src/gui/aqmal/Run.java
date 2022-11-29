package gui.aqmal;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Data User");
        jFrame.setContentPane(new GraphicalUserInterfaces().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600,500);
        jFrame.setVisible(true);
    }
}
