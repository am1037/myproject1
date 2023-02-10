package LifeGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int X = 9;
        final int Y = 9;
        int[][] map = new int[X][Y];
        int[][] map_new = new int[X][Y];
        Scanner sc = new Scanner(System.in);
        map[4][3] = 1;map[5][3] = 1;
        map[4][4] = 1;map[3][4] = 1;
        map[4][5] = 1;

        for (int y = 0; y < Y; y++) { //프린트
            for (int x = 0; x < X; x++) {
                if(map[x][y]==1)System.out.print("■");
                else System.out.print("□");
            }
            System.out.print("\n");
        }



        int go = sc.nextInt(); int k = 1;
        while (go == 1) {
            for (int y = 0; y < Y; y++) { //around whole map
                for (int x = 0; x < X; x++) {
                    /////////////////////////////////////////////////////
                    //map_new[x][y]= 0 or 1 <- how many cells on surround
                    for (int x_2 = x-1; x_2 <= x+1; x_2++) {
                        for (int y_2 = y-1; y_2 <= y+1; y_2++) {
                            if (x_2 == -1 || x_2 == X || y_2 == -1 || y_2 == X || (x_2 == x && y_2 == y)) {}
                            else map_new[x][y] = map_new[x][y]+map[x_2][y_2];
                            //System.out.println("("+x+", "+y+")"+k++ + " " + map_new[x][y]);
                        }
                    }
                    k = 1;
                    /////////////////////////////////////////////////////
                }
            }

//            for (int y = 0; y < Y; y++) { //프린트
//                for (int x = 0; x < X; x++) {
//                    System.out.print(map_new[x][y]);
//                }
//                System.out.print("\n");
//            }



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

            for (int y = 0; y < Y; y++) { //프린트
                for (int x = 0; x < X; x++) {
                    if(map[x][y]==1)System.out.print("■");
                    else System.out.print("□");
                }
                System.out.print("\n");
            }
            go = sc.nextInt();
        }
    }
}
