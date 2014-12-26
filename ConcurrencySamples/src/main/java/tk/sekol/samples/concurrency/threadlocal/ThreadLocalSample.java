package tk.sekol.samples.concurrency.threadlocal;

import java.util.concurrent.Callable;

/**
 * @author kolesnikov
 */
public class ThreadLocalSample {

    private final ThreadLocal<Integer> i1 = new ThreadLocal<>();

    public static void main(String[] agrs) {
        final int[] i = {0};

        Callable<String> task1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                i[0]++;
                return "task1";
            }
        };
    }

}
