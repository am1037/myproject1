package Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    JFrame jf;
    int i;
    JLabel jLabel;

    public Frame(int A){
        i = A;
        jf = new JFrame();
        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jf.setLayout(new GridLayout(3, 1));

        JButton jbplus = new JButton("▲");
        jbplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                jLabel.setText(String.valueOf(i));
            }
        });

        JPanel middle = new JPanel();
        middle.setLayout(new GridLayout(1, 2));

        jLabel = new JLabel(String.valueOf(i));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        Font font = new Font("굴림", 1, 50);
        jLabel.setFont(font);

        JButton reset = new JButton("A로 돌아가");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = A;
                jLabel.setText(String.valueOf(i));
            }
        });

        middle.add(jLabel);
        middle.add(reset);

        JButton jbdown = new JButton("▼");
        jbdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i--;
                jLabel.setText(String.valueOf(i));
            }
        });
        jf.add(jbplus);
        jf.add(middle);
        jf.add(jbdown);


    }
}
