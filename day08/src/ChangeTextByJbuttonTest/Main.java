package ChangeTextByJbuttonTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame Demo_Frame = new JFrame("Demo Frame");
        Demo_Frame.setLayout(new BorderLayout());
        Demo_Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Demo_Frame.setSize(250, 100);

        final JLabel J_Label = new JLabel("1");
        JButton J_Button = new JButton("Change Label");

        JTextField J_tf = new JTextField(10);
        int N = 10;
        Demo_Frame.add(J_Label, BorderLayout.NORTH);
        Demo_Frame.add(J_Button, BorderLayout.CENTER);
        Demo_Frame.add(J_tf, BorderLayout.SOUTH);
        Demo_Frame.setVisible(true);
        J_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(J_Label.getText());
                J_Label.setText(String.valueOf(i+1));
            }
        });


    }
}