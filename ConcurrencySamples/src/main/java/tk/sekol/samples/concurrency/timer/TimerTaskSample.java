package tk.sekol.samples.concurrency.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author kolesnikov
 */
public class TimerTaskSample {

    public static void main(String[] agrs) throws InterruptedException {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task working...");
            }
        };

        //лучше использовать java.util.concurrent.ScheduledThreadPoolExecutor
        Timer timer = new Timer();
        timer.schedule(task, 10000, 1000);

        Thread.sleep(20000);
        timer.cancel();
    }

}
