package tk.sekol.samples.concurrency.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * @author kolesnikov
 */
public class SummatorTask extends RecursiveTask<Long> {

    private long from;
    private long to;

    public SummatorTask(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if (to - from > 1) {
            long middle = (to + from) / 2;
            SummatorTask task1 = new SummatorTask(from, middle);
            SummatorTask task2 = new SummatorTask(middle+1, to);
            task1.fork();
            task2.fork();

            long result = 0;
            result += task1.join();
            result += task2.join();
            return result;
        } else {
            return from == to ? from : from + to;
        }
    }
}
