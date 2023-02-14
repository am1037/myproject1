package Theater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JTextField jl = new JTextField("", 10);
        jp1.setLayout(new GridLayout(5, 10));
        //f.setBackground(Color.BLUE);
        //jp1.setBackground(Color.BLUE);

        f.setTitle("극장");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(500, 400);

        FlowLayout flow = new FlowLayout();
        jp2.setLayout(flow);
        Font font = new Font("굴림", Font.BOLD, 10);

        int N = 50;
        int[] reserved = new int[N];
        JButton[] jbs = new JButton[N];
        for(int i=0; i<N; i++){
            jbs[i] = new JButton(String.valueOf(i+1));
            jbs[i].setFont(font);
            jbs[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String str = e.getActionCommand();
                    int no = Integer.parseInt(str)-1;
                    //System.out.println(str);
                    if(reserved[no]==1) {jbs[no].setBackground(null);reserved[no]=0;}
                    else {jbs[no].setBackground(Color.BLACK);reserved[no]=1;}

                }
            });

            jp1.add(jbs[i]);
        }
        JButton jb = new JButton("예약");
        jp2.add(jb);
        jp2.add(jl);
        f.add(jp1, BorderLayout.CENTER);
        f.add(jp2, BorderLayout.SOUTH);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = 0;
                for(int i=0; i<N; i++){
                    jbs[i].setBackground(null);
                    if(reserved[i]==1){reserved[i]=0;count++;}
                }
                System.out.println(count);
                jl.setText(count+"만원입니다");
            }
        });

//        JButton tot = new JButton("전체 예약 내역");
//        tot.setBackground(Color.BLUE);
//        tot.setForeground(Color.YELLOW);
//        tot.setFont(font);
//        jp2.add(tot);
//        tot.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(Arrays.toString(reserved));
//                int sum = 0;
//                for(int i=0; i<N; i++){
//                    if(reserved[i]==1) jbs[i].setBackground(Color.BLACK);
//                    sum += reserved[i];
//                }
//                jl.setText("총"+sum+"만원");
//            }
//        });

        f.setVisible(true);
    }
}
