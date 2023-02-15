package ArrayReview;

public class Main {
    public static void main(String[] args) {
        String str = "나는 프로그래머프야";
        String strstr = "진짜!!";
        String strstrstr = "                 진짜!!";
        System.out.println(str+strstr);
        System.out.println(str.concat(strstr));
        System.out.println(str.charAt(0));//char
        System.out.println(str.endsWith("야"));//boolean
        System.out.println(str.substring(3));//index 3부터 끝까지
        System.out.println(str.substring(3, 8));//index 3부터 7까지
        System.out.println(str.indexOf("프"));
        System.out.println(str.lastIndexOf("프"));
        System.out.println(str.replace("나", "너"));
        System.out.println(strstrstr);
        System.out.println(strstrstr.trim());

        Main_2.main(new String[]{"asd"});
    }
}
