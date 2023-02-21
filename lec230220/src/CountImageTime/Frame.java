package CountImageTime;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Frame extends JFrame {
    Thread[] threads;
    int count;

    public Frame(){
        setSize(600, 400);
        setLayout(new GridLayout(3, 1));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel dataLabel = new JLabel();
        Date date = new Date();
        add(dataLabel);
        dataLabel.setHorizontalAlignment(SwingConstants.CENTER);

        threads = new Thread[3];
        threads[0] = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        date.setTime(System.currentTimeMillis());
                        dataLabel.setText(date.toString());
                        threads[0].sleep(500);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        threads[0].start();

        JLabel imageLabel = new JLabel();
        ImageIcon[] imageIcons = new ImageIcon[4];
        for(int i=0; i<4; i++){
            imageIcons[i] = new ImageIcon(i+".png");
        }
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel);

        threads[1] = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        threads[1].sleep(1500);
                        imageLabel.setIcon(imageIcons[count%4]);
                        count++;
                    }catch (Exception e){
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        threads[1].start();


        JLabel fiboLabel = new JLabel();
        fiboLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(fiboLabel);
        Fibo f = new Fibo();
        f.start();
        threads[2] = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        //System.out.println(f.getResult());
                        fiboLabel.setText(String.valueOf(f.getResult()));
                    }catch (Exception e){
                        System.out.println(f.getResult());
                    }
                }
            }
        });
        threads[2].start();


    }

}
