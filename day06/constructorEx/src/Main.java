public class Main {
    public static void main(String[] args) {
        try {
            constructorEx cEx1 = new constructorEx();
            constructorEx cEx2 = new constructorEx(1);

            int[] N = {0, 1, 2};
            for(int i=0;i<4;i++){
                System.out.println(N[i]);
            }
        }catch(Exception e) {
            System.out.println("망햇워요");
        }
    }
}