import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String str = "1227210";
        //if(str=="123") System.out.println("go sleep");
        char gender = str.charAt(0);
        switch (gender){
            case 1: case 3:
                System.out.println("남자입니다");
                break;
            case 2: case 4:
                System.out.println("여자입니다");
                break;
        }
        Date date = new Date();
        int month = date.getMonth();
        int time = date.getHours();
        System.out.println("지금은 "+month+"월 "+time+"시 입니다.");
    }
}