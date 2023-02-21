package CountImageTime;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class fibofibo extends JFrame {
    Thread[] threads;
    JLabel[] fiboLabels;
    Fibo[] Fs;
    int count;
    int i;

    public fibofibo(int N){
        setSize(600, 400);
        setLayout(new GridLayout(N, 1));
        threads = new Thread[N];
        fiboLabels = new JLabel[N];
        Fs = new Fibo[N];
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel dataLabel = new JLabel();
        dataLabel.setHorizontalAlignment(SwingConstants.CENTER);

        for(i=0; i<N; i++) {
            fiboLabels[i] = new JLabel();
            fiboLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            add(fiboLabels[i]);
            Fs[i] = new Fibo();
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            for (int j = 0; j < N; j++){
                                fiboLabels[j].setText(String.valueOf(Fs[j].getResult()));
                        }
                        } catch (Exception e) {
                        }
                    }
                }
            });
        }

        for(i=0; i<N; i++) {
            Fs[i].start();
            threads[i].start();
        }

    }

}
