package ImSleepy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SentenceLength2 extends JFrame {
    JTextField t;
    JTextArea ta;
    JButton ja;


    SentenceLength2(){
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);

        t = new JTextField("저는 글자수를 표시합니다. : ");
        t.setHorizontalAlignment(SwingConstants.CENTER);
        add(t, BorderLayout.NORTH);
        ta = new JTextArea("여기에 텍스트를 입력하세요.");
        add(ta, BorderLayout.CENTER);
        ja = new JButton("저를 누르세요");
        add(ja, BorderLayout.SOUTH);



        pack();
    }


    public static void main(String[] args) {
        SentenceLength2 sl = new SentenceLength2();
    }
}
