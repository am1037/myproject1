package ThreadTest3;

public class Counter extends Thread{
    int i = 0;
    int t = 0;
    boolean on;
    public Counter(int t, boolean on){
     this.t = t;
     this.on = on;
    }
    public int getNum(){
        return i;
    }
    public void setT(int t){
        this.t = t;
    }
    public void setOn(boolean on){
        this.on = on;
    }

    @Override
    public void run(){
        while (on){
            System.out.println(t);
            try {
                Thread.sleep(1000*t);
                i++;
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
        }
    }
}
