package p1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int j = 0;
        for(int i=1; i<=N; i++){
            if(check(i)) j++;
        }
        System.out.println(j);
    }

    public static boolean check(int a){
        if(a<100) return true;
        else if(a%100==0) return false;
        else{
            int b = a / 10;
            int right = a % 10;
            int middle = b % 10;
            a = b;
            b = a / 10;
            int left = b % 10;
            while (right - middle == middle - left&&left!=0) {
                b = a / 10;
                right = a % 10;
                middle = b % 10;
                a = b;
                b = a / 10;
                left = b % 10;
                a = b;
            }
            if(left!=0) {return false;}
            else return true;
        }
    }
}

