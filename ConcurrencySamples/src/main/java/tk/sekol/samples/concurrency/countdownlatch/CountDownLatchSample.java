package tk.sekol.samples.concurrency.countdownlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kolesnikov
 */
public class CountDownLatchSample {

    public static void main(String[] agrs) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<String> task1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("task1 start");
                Thread.sleep(13000);
                System.out.println("task1 finish");
                latch.countDown();
                return "task1";
            }
        };
        Callable<String> task2 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("task2 start");
                Thread.sleep(24000);
                System.out.println("task2 finish");
                latch.countDown();
                return "task2";
            }
        };

        executorService.submit(task1);
        executorService.submit(task2);

        System.out.println("before");

        latch.await();

        System.out.println("after");
    }

}
