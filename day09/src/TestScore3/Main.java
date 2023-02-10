package TestScore3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = {"홍길동", "이순신", "뉴진스", "방탄", "블랙핑크"};
        int[] term1 = { 77, 88, 99, 55, 70 };
        int[] term2 = { 99, 100, 88, 80, 70 };

        int count1 = 0; double avg1 = 0;
        int count2 = 0; double avg2 = 0;
        int[] no1 = new int[5];
        Arrays.fill(no1, -1); int j = 0;

        for(int i=0; i<names.length; i++){
            if(term1[i]<term2[i]) count1++;
            if(term1[i]==term2[i]) count2++;
            if(term2[i]==100) no1[j++]=i;
            if(names[i].equals("뉴진스")) System.out.println("뉴진스는 "+ term1[i] + ", "+ term2[i]);
            avg1 += term1[i];
            avg2 += term2[i];
        }
        avg1 /= names.length;
        avg2 /= names.length;
        System.out.println(count1+"명");
        System.out.println(count2+"명");
        for(int i=0; i< names.length; i++){
            if(no1[i]==-1) break;
            System.out.println(no1[i]+"번, "+names[i]);
        }
        if(avg1>avg2) System.out.println("1학기"+avg1+" "+avg2);
        if(avg1<avg2) System.out.println("2학기"+avg1+" "+avg2);

    }


}
