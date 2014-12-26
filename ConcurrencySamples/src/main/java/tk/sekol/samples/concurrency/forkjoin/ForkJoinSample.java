package tk.sekol.samples.concurrency.forkjoin;

import java.util.concurrent.ForkJoinPool;

/**
 * @author kolesnikov
 */
public class ForkJoinSample {

    public static void main(String[] agrs) {
        singleThreadCalculation();

        long startTime = System.nanoTime();
        ForkJoinPool fjPool = new ForkJoinPool();
        SummatorTask task = new SummatorTask(1, 1500000000);
        System.out.println(fjPool.invoke(task));
        System.out.println("Time = " + (System.nanoTime() - startTime));
    }

    private static void singleThreadCalculation() {
        long startTime = System.nanoTime();
        long result = 0;
        for (int i = 0; i < 1500000000; i++) {
            result += i;
        }
        System.out.println(result);
        System.out.println("Time = " + (System.nanoTime() - startTime));

    }

}
