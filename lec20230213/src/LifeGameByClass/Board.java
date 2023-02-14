package LifeGameByClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame {
    JPanel mapLayer;
    JPanel txtLayer;
    JLabel[][] jls;
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
        jls = new JLabel[X][Y];
        for(int i=0;i<X;i++){
            for(int j=0;j<Y;j++){
                jls[i][j] = new JLabel();
                mapLayer.add(jls[i][j]);
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
                if(map[i][j]==1) jls[i][j].setText("●");
                else jls[i][j].setText("○");
            }
        }
    }

}



