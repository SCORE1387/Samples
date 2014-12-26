package tk.sekol.samples.concurrency.executors;

import java.util.concurrent.*;

/**
 * @author kolesnikov
 */
public class ExecutorServiceSamples {

    public static void main(String[] agrs) {
        //fixedThreadPoolSample();
        //cachedThreadPoolSample();
        scheduledSingleThreadPoolSample();
        //scheduledThreadPoolSample();
    }

    private static void fixedThreadPoolSample() {
        // создается определенное кол-во тредов, они заняты задачами
        // и как только освобождаются - берут другую задачу
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable task1 = new Task();
        Callable task2 = new Task();
        Callable task3 = new Task();

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

    }

    private static void cachedThreadPoolSample() {
        // новые треды создаются по мере необходимости и
        // могут быть удалены если долго простаивают
        ExecutorService executorService = Executors.newCachedThreadPool();

        Callable task1 = new Task();
        Callable task2 = new Task();
        Callable task3 = new Task();

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
    }

    private static void scheduledSingleThreadPoolSample() {
        // позволяет запускать задачи по расписанию
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        // TODO: в чем разница???
        ScheduledExecutorService executorService1 = Executors.newScheduledThreadPool(2);

        // задается интервал между запусками задач
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        }, 0, 10, TimeUnit.SECONDS);

        // задается интервал между запусками задач
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("test1");
            }
        }, 0, 10, TimeUnit.SECONDS);

        // задается интервал между окончанием работы задачи и следующим запуском
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("test2");
            }
        }, 0, 10, TimeUnit.SECONDS);
    }

}
