import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
            System.out.println("3을 나눌 수를 입력하세요");
            int number = sc.nextInt(); // 숫자를 입력받음
            double result = 3 / number; // 0으로 나눌경우 ArithmeticException를 던짐
            System.out.println("결과 : " + result);
            } catch (ArithmeticException e) {
            System.out.println("0으로 나누는것은 할수 없습니다.");
            } finally {
            System.out.println("입력을 더 하신걸가요? no=0, yes=나머지 숫자");
            if (sc.nextInt() == 0) {
                break;
                }
            }
        }
    }
}