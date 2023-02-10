package Ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Ns = new int[5];//{10, 20, 30, 40, 50};
        for(int i = 1; i<=5; i++){
            Ns[i-1] = i*10;
        }
        System.out.println(Ns[0]+Ns[2]);

        String[] strs = {"자바", "스프링", "JSP"};
        System.out.println(strs[0]+"보다는 "+strs[1]);

    }
}
