package ConstuctorTest;

public class Tree {
    static int numTree;
    public Tree(){
        System.out.println("나무가 자랐습니다.");
        numTree++;
    }
    public static void printNumber(){
        System.out.println("나무는 "+numTree+"그루 있습니다.");
    }
}
