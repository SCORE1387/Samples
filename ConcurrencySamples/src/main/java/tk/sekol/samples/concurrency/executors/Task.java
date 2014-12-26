package tk.sekol.samples.concurrency.executors;

import java.util.concurrent.Callable;

/**
 * @author kolesnikov
 */
public class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Thread working");
        Thread.sleep(3000);
        return "test";
    }
}
