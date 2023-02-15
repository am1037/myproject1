package LifeGame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputFrame extends JFrame {
    String X_BOUND;
    String Y_BOUND;
    String seed;

    public InputFrame() {
        setTitle("Input Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        // create two JLabels
        JLabel xLabel = new JLabel("X_bound");
        JLabel yLabel = new JLabel("Y_bound");
        JLabel seedLabel = new JLabel("put seed");

        // create two JTextFields
        JTextField xField = new JTextField(20);
        JTextField yField = new JTextField(20);
        JTextField seedField = new JTextField(20);

        // panel for JLabels
        JPanel upPanel = new JPanel(new GridLayout(3, 2));
        upPanel.add(xLabel);
        upPanel.add(xField);
        upPanel.add(yLabel);
        upPanel.add(yField);
        upPanel.add(seedLabel);
        upPanel.add(seedField);

        // create a JButton
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int X = Integer.parseInt(xField.getText());
                int Y = Integer.parseInt(yField.getText());
                int seed = Integer.parseInt(seedField.getText());
                int[][] map = new int[X][Y];
                lifeGame lg = new lifeGame(map);
                lg.genRanmap(seed);
                Board board = new Board(lg.getMap());
            }
        });

        // add components to the frame
        add(upPanel);
        add(confirmButton);

        // set layout
        setLayout(new GridLayout(2, 1));

        setVisible(true);
    }
}