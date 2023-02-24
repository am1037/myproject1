package Toy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Field extends JFrame {
    int X_bound;
    int Y_bound;
    JPanel mapPanel;
    JPanel buttonPanel;
    JButton[] arrows;
    String action;

    public Field(){
        //X_bound = X;
        //Y_bound = Y;
        setSize(600, 600);
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        mapPanel = new JPanel();
        mapPanel.setLayout(null);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));
        arrows = new JButton[9];
        int[] num = {7, 8, 9, 4, 5, 6, 1, 2, 3}; int n=0;
        for(JButton jb : arrows){
            jb = new JButton(String.valueOf(num[n]));
            jb.addActionListener(e -> {
                //
            });
            buttonPanel.add(jb);
            n++;
        }



        add(mapPanel);
        add(buttonPanel);
    }

    public static void main(String[] args) {
        Field f = new Field();
    }
}
