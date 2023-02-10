package LifeGameByClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int X = 9;
        final int Y = 9;
        int[][] map = new int[X][Y];
        map[4][3] = 1;map[5][3] = 1;
        map[4][4] = 1;map[3][4] = 1;
        map[4][5] = 1;


        lifeGame lg = new lifeGame(map);
        for(int i = 0; i<10; i++) {
            lg.printMap();
            lg.lifeIter();
        }
        //System.out.println(map.length);

    }
}
