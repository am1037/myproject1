package ThreadPractices;

public class Raindrop extends Thread{
    int x_Loc, y_Loc, t;
    Thread thread;
    public Raindrop(int x, int y){
        x_Loc = x;
        y_Loc = y;
    }
    public void setT(int t){
        this.t=t;
    }

    public int getX(){
        return x_Loc;
    }

    public int getY(){
        return y_Loc;
    }

    @Override
    public void run(){
        try{
            while (true) {
                Thread.sleep(t);
                y_Loc++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
