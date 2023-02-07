public class Main {
    public static void main(String[] args) {

        String str01 = new String("abc");
        String str02 = "abc";
        System.out.println(str01.toString()==str02);;
        System.out.println(str01.equals(str02));
        String str03 = new String("abc");
        System.out.println("== Test");
        System.out.println(str01==str02);
        System.out.println(str01=="abc");
        System.out.println(str02=="abc");
        System.out.println(str01==str03);
        System.out.println("equal Test");
        System.out.println(str01.equals(str02));
        System.out.println(str01.equals("abc"));
        System.out.println(str02.equals("abc"));
        System.out.println(str01.equals(str03));
        System.out.println("toString Test");
        System.out.println(str01.toString()==str02);;
        System.out.println(str01.equals(str02));
    }
}