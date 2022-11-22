package edu.aqmal.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInput {
    private JTextField textUsername;
    private JButton bottonlogin;
    private JPanel rootPanel;
    private JPasswordField textPassword;
    private JLabel labelOutput;

    public UserInput() {
        bottonlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = textUsername.getText();
                String pw = textPassword.getText();
                Person prsn = new Person ();
                prsn.setPw(pw);
                prsn.setUsername(Username);
                labelOutput.setText(prsn.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
