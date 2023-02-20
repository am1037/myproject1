package ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciThread implements Callable<Long> {
    private int n;

    public FibonacciThread(int n){
        this.n = n;
    }

    @Override
    public Long call() throws Exception {
        if(n==0){
            return 0L;
        } else if(n==1){
            return 1L;
        } else {
            FibonacciThread f1 = new FibonacciThread(n-1);
            FibonacciThread f2 = new FibonacciThread(n-2);
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            Future<Long> future1 = executorService.submit(f1);
            Future<Long> future2 = executorService.submit(f2);
            long result = future1.get()+future2.get();
            executorService.shutdown();
            return result;
        }
    }

    public static void main(String[] args) throws Exception{
        int n = 14;
        FibonacciThread f = new FibonacciThread(n);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Long> future = executorService.submit(f);
        long result = future.get();
        System.out.println("Fibonacci ("+n+") : "+result);
        executorService.shutdown();
    }
}
