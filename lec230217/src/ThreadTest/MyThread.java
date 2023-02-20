package ThreadTest;

public class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread is running.");
        for(int i=0; i<100; i++) System.out.println("올라간다");
    }
}
