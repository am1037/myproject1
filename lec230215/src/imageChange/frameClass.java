package imageChange;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class frameClass {
    static int[] buttons = {0, 0, 0};
    static JTextField textField = new JTextField();
    static JTextField tx = new JTextField();
    static JLabel imageLabel = new JLabel();
    JFrame frame = new JFrame("My Window");

    public frameClass() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        JPanel bottombuttonPanel = new JPanel(new GridLayout(1, 2));

        // Create the text field and add it to the panel
        textField.setPreferredSize(new Dimension(200, 30));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);

        // Create the buttons and add them to the panel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons[0]++;
                textField.setText("버튼1 "+buttons[0]+"번 눌림");
                imageLabel.setIcon(new ImageIcon("1.jpg"));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons[1]++;
                textField.setText("버튼2 "+buttons[1]+"번 눌림");
                imageLabel.setIcon(new ImageIcon("2.jpg"));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons[2]++;
                textField.setText("버튼3 "+buttons[2]+"번 눌림");
                imageLabel.setIcon(new ImageIcon("3.jpg"));
            }
        });

        buttonPanel.add(textField);

        JButton jb = new JButton("계산할까요");
        bottombuttonPanel.add(jb);
        bottombuttonPanel.add(tx);
        tx.setHorizontalAlignment(SwingConstants.RIGHT);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tx.setText(buttons[0]*1000+buttons[1]*100+buttons[2]*10+"원입니다");
                frame.setTitle("버튼 1은 "+buttons[0]+"번, 버튼 2는 "+buttons[1]+"번, 버튼 3은 "+buttons[2]+"번 눌렸습니다.");
            }
        });

        // Create a panel for the image and label
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.black);

        // Create the image label and add it to the panel
        //JLabel imageLabel = new JLabel();
        imagePanel.add(imageLabel, BorderLayout.CENTER);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create the text label and add it to the panel
//        JLabel textLabel = new JLabel();
//        textLabel.setHorizontalAlignment(JLabel.CENTER);
//        textLabel.setVerticalAlignment(JLabel.CENTER);
//        textLabel.setPreferredSize(new Dimension(800, 30));
//        textLabel.setBackground(Color.LIGHT_GRAY);
//        textLabel.setOpaque(true);
//        imagePanel.add(textLabel, BorderLayout.SOUTH);

        // Add the panels to the frame
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(imagePanel, BorderLayout.CENTER);
        frame.add(bottombuttonPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }

}
