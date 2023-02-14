package LifeGame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame {
    JPanel mapLayer;
    JPanel txtLayer;
    JButton[][] jbs;
    int X;
    int Y;
    int[][] map;
    public Board(int[][] map){
        this.setLayout(new BorderLayout());
        this.map=map;
        X = map.length;
        Y = map[0].length;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        mapLayer = new JPanel();
        mapLayer.setLayout(new GridLayout(X, Y));
        jbs = new JButton[X][Y];


        for(int i=0;i<X;i++){
            for(int j=0;j<Y;j++){
                jbs[i][j] = new JButton();
                int a = i;
                int b = j;
                jbs[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(a+", "+b);
                        if(map[a][b]==0){
                            jbs[a][b].setBackground(Color.black);
                            map[a][b]=1;
                        }else {
                            jbs[a][b].setBackground(null);
                            map[a][b]=0;
                        }
                    }
                });
                mapLayer.add(jbs[i][j]);
            }
        }
        printMap(map);
        add(mapLayer);
        setVisible(true);

        txtLayer = new JPanel();
        JButton jb = new JButton("iterate!");
        JLabel jl = new JLabel("test");
        txtLayer.add(jb);
        txtLayer.add(jl);
        add(txtLayer, BorderLayout.SOUTH);
        lifeGame lg = new lifeGame(map);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lg.lifeIter();
                printMap(lg.getMap());
                jl.setText(lg.iter+"th iteration");
            }
        });
    }

    public void printMap(int[][] map){
        this.map=map;
        for(int i=0;i<X;i++){
            for(int j=0;j<Y;j++){
                if(map[i][j]==1) jbs[i][j].setBackground(Color.BLACK);
                else jbs[i][j].setBackground(null);
            }
        }
    }

}



