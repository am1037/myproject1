package DiceByForEach;

public class DBFE {
    public static void main(String[] args) {
        char[] eyes = {'1', '2', '3', '4', '5', '6'};
        int i = 0;
        for(char eye_1:eyes){
            for(char eye_2:eyes){
                i++;
                System.out.println(i+" : "+eye_1+", "+eye_2);
            }
        }
    }
}
