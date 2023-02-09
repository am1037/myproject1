package idpw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String pw = sc.nextLine();
        if(id.equals("root")&&pw.equals("1234")) System.out.println("로그인 성공!");
        else System.out.println("로그인 실패,,");

        String[] appleNum = sc.nextLine().split(", ");
        String[] berryNum = sc.nextLine().split(", ");
        System.out.println("사과 구매 가격은 "+Integer.parseInt(appleNum[0])*Integer.parseInt(appleNum[1])+"원 입니다.");
        System.out.println("딸기 구매 가격은 "+Integer.parseInt(berryNum[0])*Integer.parseInt(berryNum[1])+"원 입니다.");
        System.out.println("전체 가격은 "+Integer.parseInt(appleNum[0])*Integer.parseInt(appleNum[1])+Integer.parseInt(berryNum[0])*Integer.parseInt(berryNum[1])+"원 입니다.");

        int start = sc.nextInt();
        int end = sc.nextInt();
        int result = 0;
        for(int i=start;i<=end;i++) result += i;
        System.out.println(start+"부터 "+end+"까지의 "+"총합은 " + result);

        start = sc.nextInt();
        end = sc.nextInt();
        int jump = sc.nextInt();
        result = 0;
        for(int i=start;i<=end;i+=jump) {
            result += i;
            if(result>100) break;
        }
        System.out.println(start+"부터 "+end+"까지의 "+jump+"씩 폴짝폴짝 "+"총합은 " + result);


    }
}
