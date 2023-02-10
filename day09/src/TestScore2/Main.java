package TestScore2;

import java.util.Random;

public class Main  {

    public static void main(String[] args) {
        Random r = new Random(42);

        int[] n1 = new int[10000];
        int[] n2 = new int[10000];

        for (int i = 0; i < n2.length; i++) {
            n1[i] = r.nextInt(101);
            n2[i] = r.nextInt(101);
        }

        int count = 0; //동일한 갯수 누적
        int count2 = 0; //동일하지 않은 갯수 누적

        for (int i = 0; i < n2.length; i++) {
            System.out.println(n1[i] == n2[i]);
            if (n1[i] > n2[i]) {
                count++;
            } else if (n1[i] < n2[i]) {
                count2++;
            }
        }//for
        System.out.println("1학기가 더 좋은 " + count + "명");
        System.out.println("2학기가 더 좋은 " + count2 + "명");


    }

}