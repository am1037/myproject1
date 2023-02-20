package ConstuctorTest;

public class Oak extends Tree{
    static int numTree;
    public Oak(){
        System.out.println("참나무가 자랐습니다.");
        numTree++;
    }
    public Oak(int i){
        System.out.println("참나무가 "+i+"그루 자랐습니다.");
        numTree+=i;
    }

    public static void printNumber2(){
        System.out.println("나무는 "+numTree+"그루 있습니다.");
    }
}
