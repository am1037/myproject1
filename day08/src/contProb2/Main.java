package contProb2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int target = 77;
        Scanner sc = new Scanner(System.in);

        int data = 0;
        int tryN = 0;
        while (true) {
            System.out.print("생각한 정답은?? ");
            data = sc.nextInt();
            tryN++;
            if (data == target) {
                System.out.println("정답입니다.");
                System.out.println("시도 횟수는 "+tryN+"회 입니다.");
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("오답입니다.");
                if(data>target) System.out.println("커요");
                if(data<target) System.out.println("작아요");
                System.out.println("다시 시도해주세요.");
                //data가 target보다 크면 "너무 커요"
                //data가 target보다 작으면 "너무 작아요"
            }
        }
        sc.close();
    }
}