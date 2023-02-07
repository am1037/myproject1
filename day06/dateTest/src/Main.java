import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        int year = 1900 + date.getYear();
        int month = 1 + date.getMonth();
        //int date_ = date.getDate();
        int day = date.getDay();

        if(year<2000) System.out.println("밀레니엄 세대가 아니군요");
        else System.out.println("밀레니엄 세대시군요");

        if(day==0||day==6) System.out.println("놀자");
        else System.out.println("공부하자");

        switch (month){
            case 2:
                System.out.println("28일");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30일");
                break;
            default:
            System.out.println("31일");

        }
    }
}