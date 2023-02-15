package ArrayReview;

public class Main_4 {
    public static void main(String[] args) {
        String[][] s = {
                {"2","3","5"},
                {"7","11","13"},
                {"17","19","23","29"}
        };

        for(int i=0;i<s.length;i++){
            for(String str:s[i]){
                System.out.println(str);
            }
        }
        for(String[] strA:s){
            for(String str:strA) {
                System.out.println(str);
            }
        }
    }

}
