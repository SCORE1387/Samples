package tk.sekol.samples.collections.queue;

/**
 * @author kolesnikov
 */
public class ArrayQueueMain {

    public static void main(String[] agrs) {
        Queue<String> queue = new ArrayQueue<>();

        System.out.println(queue.enqueue("1") + " (true)");
        System.out.println(queue);
        System.out.println(queue.enqueue("2") + " (true)");
        System.out.println(queue);
        System.out.println(queue.enqueue("3") + " (true)");
        System.out.println(queue);

        System.out.println(queue.enqueue("4") + " (false)");
        System.out.println(queue);

        System.out.println(queue.front() + "(1)");
        System.out.println(queue.dequeue() + "(1)");
        System.out.println(queue);

        System.out.println(queue.front() + "(2)");
        System.out.println(queue.dequeue() + "(2)");
        System.out.println(queue);

        System.out.println(queue.enqueue("4") + " (true)");
        System.out.println(queue);

        System.out.println(queue.enqueue("5") + " (true)");
        System.out.println(queue);

        System.out.println(queue.enqueue("6") + " (false)");
        System.out.println(queue);
    }

}
