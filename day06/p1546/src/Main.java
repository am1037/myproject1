import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);

        int sum = 0;
        for(int i=0; i<N; i++){
            sum += score[i];
        }
        double result = ((double)100*sum/score[N-1])/N;
        System.out.println(result);
    }
}