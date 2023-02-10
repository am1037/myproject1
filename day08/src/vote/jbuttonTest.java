package vote;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jbuttonTest {
    static int bn1 = 0;
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(300, 800);

        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        Font font1 = new Font("궁서", 1, 20);
        Font font2 = new Font("궁서", 1, 30);

        JLabel l1 = new JLabel();
        l1.setText("인기투표 시스템");
        l1.setFont(font1);
        JLabel l2 = new JLabel();
        l2.setText("왼쪽펭귄");
        l2.setFont(font1);
        JLabel l3 = new JLabel();
        l3.setText("가운데펭귄");
        l3.setFont(font1);
        JLabel l4 = new JLabel();
        l4.setText("오른쪽펭귄");
        l4.setFont(font1);

        JLabel l5 = new JLabel();//아이유 투표수
        l5.setFont(font2);
        l5.setForeground(Color.red);
        JLabel l6 = new JLabel();//방탄 투표수
        l6.setFont(font2);
        l6.setForeground(Color.red);
        JLabel l7 = new JLabel();//뉴진스 투표수
        l7.setFont(font2);
        l7.setForeground(Color.red);

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();

        ImageIcon icon1 = new ImageIcon("1.png");
        ImageIcon icon2 = new ImageIcon("2.png");
        ImageIcon icon3 = new ImageIcon("3.png");
        b1.setIcon(icon1);
        b2.setIcon(icon2);
        b3.setIcon(icon3);

        f.add(l1);

        f.add(b1);
        f.add(l2);
        f.add(l5);

        f.add(b2);
        f.add(l3);
        f.add(l6);

        f.add(b3);
        f.add(l4);
        f.add(l7);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bn1++;
                l5.setText(String.valueOf(bn1));
            }
        });
        b2.addActionListener(new ActionListener() {
            int bn3 = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                bn3++;
                l6.setText(String.valueOf(bn3));
            }
        });
        b3.addActionListener(new ActionListener() {
            int bn1 = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                bn1++;
                l7.setText(String.valueOf(bn1));
            }
        });
    }
}
