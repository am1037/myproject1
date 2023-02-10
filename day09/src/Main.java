import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            System.out.println(3%5);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //int[] answer = {};
        int newn = numer1*denom2+numer2*denom1;
        int newd = denom1*denom2;
        int q = hoze(newn, newd);

        int[] answer = {(newn/q), (newd/q)};
        return answer;
    }

    public int hoze(int A, int B){
        int r = B*(A/B);
        A = B;
        B = r;
        while(true){
            r = B*(A/B);
            if(r==0) break;
            A = B;
            B = r;
        }
        return B;
    }
}