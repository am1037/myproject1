package CountImageTime;

import java.util.ArrayList;

public class Fibo extends Thread{
    ArrayList<Integer> list;
    int n;
    public Fibo(){
        list = new ArrayList<>();
        list.add(0);
        list.add(1);
        n = 2;
    }
    public int getResult(){
        return list.get(list.size()-1);
    }
    @Override
    public void run(){
        try {
            while (true){
                sleep(1000);
                list.add(list.get(n - 2) + list.get(n - 1));
                n++;
            }}catch (Exception e){
        }
    }
}
