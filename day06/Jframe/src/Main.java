import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(1024, 768);
        FlowLayout flow = new FlowLayout();

        JButton b1 = new JButton();
        b1.setText("나는 버튼1");
        JButton b2 = new JButton();
        b2.setText("나는 버튼2");

        JLabel l1 = new JLabel();
        l1.setText("나는 텍스트1");
        JLabel l2 = new JLabel();
        l2.setText("나는 텍스트2");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);

        Font font = new Font("궁서", 1, 20);
        b1.setFont(font);
        b1.setForeground(Color.white);
        b1.setBackground(Color.red);
        l1.setFont(font);
        t1.setFont(font);
        b2.setFont(font);
        l2.setFont(font);
        t2.setFont(font);

        ImageIcon icon = new ImageIcon("Penguins.jpg");
        b1.setIcon(icon);
        b2.setIcon(icon);

        f.setLayout(flow);
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(l2);
        f.add(t2);
        f.add(b2);

        f.setVisible(true);
    }

}