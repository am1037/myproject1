package p2738;

import java.util.Scanner;

public class twobytwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        int[][] A1 = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A1[i][j] += sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.printf("%d ", A1[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
