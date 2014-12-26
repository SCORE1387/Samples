package tk.sekol.samples.concurrency;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.*;

/**
 * @author kolesnikov
 */
public class Main {

    public static void main(String[] agrs) throws InterruptedException, ExecutionException {
        System.out.println("main start");
        Callable<String> task1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("task1 start");
                Thread.sleep(13000);
                System.out.println("task1 finish");
                return "task1";
            }
        };
        Callable<String> task2 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("task2 start");
                Thread.sleep(24000);
                if (true) throw new RuntimeException("exception task2");
                System.out.println("task2 finish");
                return "task2";
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Collection<Future<String>> futures = executorService.invokeAll(Arrays.asList(task1, task2));
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        System.out.println("main finish");
    }

}
