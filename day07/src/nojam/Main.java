package nojam;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            try {
                // 10명에게 배부른가요?? 물어봐서!!
                // 배부르다고 한 사람, 안부르다고 한 사람 몇 명 카운트
                int c1 = 0; //배부른 사람 카운트
                int c2 = 0; //안배부른 사람 카운트
                int c3 = 0; //안배부른 사람 카운트
                for (int i = 0; i < 10; i++) {
                    String data = JOptionPane.showInputDialog("인기 투표를 해봅시다? 1)아이유 2)유재석 3)뉴진스");
                    if (data.equals("1")) {
                        //full = full + 1; // 0 + 1
                        c1++;
                    } else if (data.equals("2")) {
                        c2++;
                    } else if (data.equals("3")) {
                        c3++;
                    } //for
                }
                System.out.println("아이유 " + c1 + "명");
                System.out.println("유재석 " + c2 + "명");
                System.out.println("뉴진스 " + c3 + "명");
            }catch (Exception e){
                System.out.println("asd");
            }
    }


}
