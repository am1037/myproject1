package ConstuctorTest;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        Oak oak1 = new Oak();
        Oak oak2 = new Oak();
        Oak oak3 = new Oak();
        Oak oaks = new Oak(10);
        Tree.printNumber();
        Oak.printNumber();
        Oak.printNumber2();
        //System.out.println(Oak.numTree);
    }
}
