package TryCatchSample;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 잘 나옵니다.");
                for (int i = 1; i >= -1; i--) {
                    try {
                        System.out.println("2. 잘 나올까요? " + (1 / i));
                    } catch (Exception e) {
                        System.out.println("3. 잘 안 나왔습니다.");
                        //e.printStackTrace();
                    }
                }

        Random r = new Random();
        int count = 0;
        int[] target = new int[5];
            while (count<10){
                try {
                    target[r.nextInt(10)]++;
                    System.out.println("맞췄습니다.");
                }catch (Exception e){
                    System.out.println("빗나갔습니다.");
                    count++;
                }
            }

    }
}
