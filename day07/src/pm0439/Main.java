package pm0439;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String name = sc.nextLine();
        bw.write("나의 이름은 "+name);
        Double height = sc.nextDouble();
        Double weight = sc.nextDouble();
        Boolean dinner = sc.nextBoolean();
        String duty = sc.nextLine();
        bw.flush();
        bw.close();

    }
}
