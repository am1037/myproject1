import java.util.Date;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        long currentTime = System.currentTimeMillis();
        Date date = new Date(currentTime);
        while (true) {
            date.setTime(System.currentTimeMillis());
            System.out.println(date.toString());
            Thread.sleep(1000);
        }
    }
}