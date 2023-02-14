package deeplow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] x = {1, 2, 3};
//        int[] y_1 = x;
//        int[] y_2 = x.clone();
//        System.out.println(y_1 == y_2);
//        System.out.println(y_1[2]==y_2[2]);
//        System.out.println(Arrays.toString(y_1));
//        System.out.println(Arrays.toString(y_2));
//        x[0] = 100;
//        System.out.println(y_1 == y_2);
//        System.out.println(Arrays.toString(y_1));
//        System.out.println(Arrays.toString(y_2));

//        int[][] xx = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] yy_1 = xx;
//        int[][] yy_2 = xx.clone();
//        System.out.println(Arrays.toString(yy_1));
//        System.out.println(Arrays.toString(yy_2));
//        System.out.println(yy_1==yy_2);

        String[] subject={"국어", "영어", "수학", "컴퓨터", "회화"};
        int[][] score = new int[2][5];
        score[0] = new int[]{44, 66, 22, 99, 100};
        score[1] = score[0].clone();
        score[1][0] = 22;
        score[1][2] = 88;
        System.out.println(Arrays.toString(score[0]));
        System.out.println(Arrays.toString(score[1]));
        int count = 0;
        for(int i=0; i<5; i++){
            if(score[0][i] == score[1][i]) count++;
        }
        System.out.println(count);


    }
}
