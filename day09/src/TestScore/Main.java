package TestScore;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int ANSWER = 42;//삶우주그리고모든것..
        int N = 10000;
        Random r = new Random(ANSWER);
        int[] score = new int[N];

        int n_100 = 0; double avg = 0;
        int n_0 = 0;
        ArrayList<Integer> n_100_index = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            score[i] = r.nextInt(451);
            avg = avg + score[i];
            if (score[i]==450) {
                n_100++;
                n_100_index.add(i);
            }
            if (score[i]==0) n_0++;
        }
        avg = avg/N;
        int num_avg = 0;
        for(int sco:score){
            if(Math.abs(sco-avg)<51) num_avg++;
        }

        System.out.println("만점자는 "+n_100+"명 입니다.");
        System.out.println("만점자의 인덱스는 "+n_100_index.toString()+" 입니다.");
        System.out.println("빵점자는 "+n_0+"명 입니다.");
        System.out.println("평균은 "+avg+"점 입니다.");
        System.out.println("평균 +- 50점인 학생은 "+num_avg+"명 입니다.");

    }
}
