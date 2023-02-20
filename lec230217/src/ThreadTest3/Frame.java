package ThreadTest3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Frame extends JFrame {
    int N;
    String[] strings;
    JLabel[] jLs;
    JTextField[] jTs;
    Counter[] counters;
    Thread t0;
    Color[] colors;

    public Frame(int N){
        this.N = N;
        Random r = new Random(42);
        colors = new Color[]{Color.red, Color.green, Color.blue};
        setSize(600, 200);
        setLayout(new GridLayout(2, N));

        jLs = new JLabel[N];
        jTs = new JTextField[N];
        counters = new Counter[N];
        for(int i=0; i<N; i++) {
            jLs[i] = new JLabel(i+1+"");
            jTs[i] = new JTextField((r.nextInt(10)+1)+"",1);
            jLs[i].setHorizontalAlignment(SwingConstants.CENTER);
            jTs[i].setHorizontalAlignment(SwingConstants.CENTER);
            add(jLs[i]);
            counters[i] = new Counter(1, true);
        }
        for(int i=0; i<N; i++){
            counters[i].start();
            add(jTs[i]);
        }

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        t0 = new Thread(()->{
            while (true) {
                    try {
                        for (int i = 0; i < N; i++) {
                            counters[i].setT(Integer.parseInt(jTs[i].getText()));
                            jLs[i].setText(counters[i].getNum()+"");
                            jLs[i].setForeground(colors[counters[i].getNum()%3]);
                        }
                        t0.sleep(100);
                    //System.out.println("Text" + Integer.parseInt(jTs[i].getText()));
                    }catch (Exception e){//error
                    } //trycatch 끝나는곳
            }
        });
        t0.start();
    }

}
