package ThreadTest2;

public class Thread2 extends Thread{

    public void run(){
        for (int i = 0; i<1000; i++)
            System.out.println("2");
    }
}
