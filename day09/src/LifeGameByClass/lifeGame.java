package LifeGameByClass;

import java.util.Scanner;

public class lifeGame {
        int X, Y;
        int[][] map;
        int[][] map_new;
        int[][] initialMap;
        int iter=0;

        lifeGame(int[][] initialMap){
            this.initialMap = initialMap;
            X = initialMap.length;
            Y = initialMap[0].length;
            map = initialMap;
            map_new = new int[X][Y];
        }



        public void lifeIter() {
            iter++;
            for (int y = 0; y < Y; y++) { //around whole map
                for (int x = 0; x < X; x++) {
                    /////////////////////////////////////////////////////
                    //map_new[x][y]= 0 or 1 <- how many cells on surround
                    for (int x_2 = x - 1; x_2 <= x + 1; x_2++) {
                        for (int y_2 = y - 1; y_2 <= y + 1; y_2++) {
                            if (x_2 == -1 || x_2 == X || y_2 == -1 || y_2 == X || (x_2 == x && y_2 == y)) {
                            } else map_new[x][y] = map_new[x][y] + map[x_2][y_2];
                        }
                    }
                    /////////////////////////////////////////////////////
                }
            }


            for (int y = 0; y < Y; y++) {
                for (int x = 0; x < X; x++) {
                    if (map[x][y] == 0) {
                        if (map_new[x][y] == 3) map[x][y] = 1;
                        else map[x][y] = 0;
                    } else {
                        if (map_new[x][y] == 2 || map_new[x][y] == 3) map[x][y] = 1;
                        else map[x][y] = 0;
                    }
                    ; //갱신
                    map_new[x][y] = 0;
                }
            }
        }

        public void printMap() {
            System.out.print(iter+"th iteration\n");
            for (int y = 0; y < Y; y++) { //프린트
                for (int x = 0; x < X; x++) {
                    if (map[x][y] == 1) System.out.print("■");
                    else System.out.print("□");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }


}
