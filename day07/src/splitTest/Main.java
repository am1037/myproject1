package splitTest;

public class Main {
    public static void main(String[] args) {
        String str = "a b c d e f g";
        String[] strArr = str.split("");
        for (String strstr : strArr){
            System.out.println(strstr);
        }
    }
}
