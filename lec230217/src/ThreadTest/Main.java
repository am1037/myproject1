package ThreadTest;

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread2 t2 = new MyThread2();
        t.start();
        t2.start();
    }
}