import javax.swing.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String str = "pass";

        System.out.println("암호를 대시오");
        if(str.equals("pass")) System.out.println("들어오세요");
        else System.out.println("나가세요");

        str = "자장면";
        System.out.println("당신이 먹고 싶은 저녁 메뉴는?");
        switch (str.toString()){
            case "자장면":
                System.out.println("중국집으로 갑시다");
                break;
            case "라면":
                System.out.println("분식집으로 갑시다");
                break;
            case "회":
                System.out.println("횟집으로 갑시다");
                break;
            default:
                System.out.println("굶어요");
                break;
        }

        str = JOptionPane.showInputDialog("두 정수를 입력하세요");
        StringTokenizer st = new StringTokenizer(str);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if(A>B) System.out.println(A);
        else if(A<B) System.out.println(B);
        else System.out.println(A+" "+B);

        String no = "A100EX";
        switch (no.charAt(0)){
            case 'A':
                System.out.println("기획부");
                break;
            case 'B':
                System.out.println("총무부");
                break;
            case 'C':
                System.out.println("개발부");
                break;
            default:
                System.out.println("도둑이야ㅑ");
                break;
        }
    }
}