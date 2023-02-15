package classTest;

public class Main_3 {
    static String strTitle = "";
    static String strContent = "";

    public static void main(String[] args) {
        Door door = new Door();
        //Page page = new Page();
    }

    public static void getContent(String str1, String str2){
        strTitle = str1;
        strContent = str2;
        System.out.println("여기는 메인이다 오바");
        System.out.println(strTitle);
        System.out.println(strContent);
    }
}
