package ArrayTest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] INT = new int[5];
        System.out.println(INT.length);
        INT[0]=100;
        INT[INT.length-1]=500;
        INT[2]=200;
        System.out.println(Arrays.toString(INT));
        for(int i=0; i<INT.length;i++){
            System.out.print(i+" : "+INT[i]+"\n");
        }
    }
}
