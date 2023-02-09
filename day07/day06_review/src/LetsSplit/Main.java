package LetsSplit;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World!";
        try {
            String[] hw = str.split(" ");
//            System.out.println(hw[0]);
//            System.out.println(hw[1]);
//            System.out.println(hw[2]);
//            System.out.println(1/0);
            for (String str_sub : hw) {
                System.out.println(str_sub);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("여긴 아무것도 없어요!");
        }catch (Exception e){
            System.out.println("어캐햇ㅅ노시발련아");
        }
    }
}
