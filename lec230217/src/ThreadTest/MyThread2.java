package ThreadTest;

public class MyThread2 extends Thread {
    public void run() {
        System.out.println("MyThread2 is running.");
        for(int i=100; i>0; i--) System.out.println("내려간다");
    }
}
