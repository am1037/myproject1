package p15596;

public class Main {
    public static void main(String[] args) {

    }

    public static long sum(int[] a){
        long result=0;

        for(int i:a){
            result+=i;
        }

        return result;
    }

    static int d(int a){
        int result = a;
        int divider = 10;
        while (a%10!=0) {
            result = result + a % 10;
            a = a/10;
        }
        return result;
    }
}
