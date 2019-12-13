package maximum;
import minimum.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        MyThread myThread = new MyThread();
        Thread rThread = new Thread(new RunnableThread());
        singleThreadExecutor.submit(myThread);
        singleThreadExecutor.submit(rThread);
        executorService.shutdown();
    }
}