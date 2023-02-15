package imageChange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_22 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));

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

            }
        });

        // Create the text field and add it to the panel
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 30));
        buttonPanel.add(textField);

        // Create a panel for the image and label
        JPanel imagePanel = new JPanel(new BorderLayout());

        // Create the image label and add it to the panel
        JLabel imageLabel = new JLabel();
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        // Create the text label and add it to the panel
        JLabel textLabel = new JLabel();
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setVerticalAlignment(JLabel.CENTER);
        textLabel.setPreferredSize(new Dimension(800, 30));
        textLabel.setBackground(Color.LIGHT_GRAY);
        textLabel.setOpaque(true);
        imagePanel.add(textLabel, BorderLayout.SOUTH);

        // Add the panels to the frame
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(imagePanel, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }

}
