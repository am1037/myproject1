import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        char c = st.nextToken().charAt(0);

        switch (c){
            case '+':
                System.out.println(A+B);
                break;
            case '-':
                System.out.println(A-B);
                break;
            case '/':
                System.out.println(A/B);
                break;
            case '*':
                System.out.println(A*B);
                break;
        }
        str = sc.nextLine();
        st = new StringTokenizer(str);
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        DecimalFormat form = new DecimalFormat("#.##");
        A = (int)a; B = (int)b;
        System.out.println("by int : "+A/B);
        System.out.println("by int : "+form.format(a/b));
    }
}