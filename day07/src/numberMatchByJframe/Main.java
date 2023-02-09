package numberMatchByJframe;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.yellow);

        FlowLayout fl = new FlowLayout();
        jf.setLayout(fl);

        JLabel jl1 = new JLabel("숫자를 맞춰보자!");
        Font bigfont = new Font("굴림", 1, 20);
        jl1.setFont(bigfont);
        jf.add(jl1);

        JTextField jtl = new JTextField(15);
        Font middlefont = new Font("굴림", 1, 15);
        jtl.setFont(middlefont);
        jf.add(jtl);

        JButton jb1 = new JButton("버튼을 누르자!");
        Font smallfont = new Font("굴림", 1, 10);
        jb1.setFont(smallfont);
        jf.add(jb1);

        jf.setVisible(true);
    }
}
