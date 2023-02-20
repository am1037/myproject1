package ClassTest;

public class Mask {
    String color;
    int price;
    static int number;

    public Mask(String color, int price, int number){
        this.color = color;
        this.price = price;
        this.number += number;
    }

    public static void totalMask(){
        System.out.println("마스크의 총 개수는 "+number+"개 입니다.");
    }
}
