package LifeGameByClass;

import java.util.Random;

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

        public int[][] genRanmap(int seed){
            iter = 0;
            int N = X;
            int M = Y;
            int[][] map_gen = new int[N][M];
            Random r = new Random(seed);
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    map_gen[i][j] = r.nextInt(2);
                }
            }
            this.map=map_gen;
            return map_gen;
        }

        public int[][] getMap(){
            return map;
        }

        public int[][] lifeIter() {
            //System.out.println(X);
            //System.out.println(Y);
            iter++;
            for (int y = 0; y < Y; y++) { //around whole map
                for (int x = 0; x < X; x++) {
                    //map_new[x][y]= 0 or 1 <- how many cells around surround
                    for (int x_2 = x-1; x_2 <= x+1; x_2++) {
                        for (int y_2 = y-1; y_2 <= y+1; y_2++) {
                            if (x_2 == -1 || x_2 == X || y_2 == -1 || y_2 == Y || (x_2 == x && y_2 == y)) {
                            } else {
                                //System.out.println("x_2 : "+x_2+", y_2 : "+y_2);
                                map_new[x][y] = map_new[x][y] + map[x_2][y_2];}
                        }
                    }
                }
            } //map for end here


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
            return map;
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
