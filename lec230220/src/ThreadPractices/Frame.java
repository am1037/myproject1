package ThreadPractices;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Frame extends JFrame {
    ArrayList<JLabel> jls;
    JLabel jl;
    Thread thread;

    public Frame(){
        jls = new ArrayList<>();

        jl = new JLabel();
        add(jl);
        ImageIcon ii = new ImageIcon("drop.png");
        jl.setIcon(ii);
        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Random r= new Random();
        Raindrop rd = new Raindrop(r.nextInt(800), 0);
        rd.setT(r.nextInt(100)+10);
        jl.setSize(64, 64);
        jl.setLocation(rd.getX(), rd.getY());
        rd.start();

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        thread.sleep(10);
                        jl.setLocation(rd.getX(), rd.getY());
                        System.out.println("hmm, "+rd.getX()+", "+rd.getY()+", "+rd.x_Loc+", "+rd.y_Loc);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();


    }
}
