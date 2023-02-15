package MethodNameTest;

public class Main {
    public static void main(String[] args) {
        TyepIdentifier ti = new TyepIdentifier();
        short a = (short) 31768;
        System.out.println(a);
        ti.print();
        ti.print(11111111);
        ti.print(1.1);
        ti.print("1");
        ti.print(1, 1);
        ti.print(1.1, 1);
        ti.print(1, 1.1);
    }
}
