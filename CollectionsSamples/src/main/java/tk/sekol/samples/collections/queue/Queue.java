package tk.sekol.samples.collections.queue;

/**
 * FIFO collection (First-In-First-Out)
 * @see tk.sekol.samples.collections.queue.ArrayQueue
 * @author kolesnikov
 */
public interface Queue<V> {

    //помещает элемент в конец очереди
    //также может называться offer()
    boolean enqueue(V o);

    //возвращает и удаляет первый элемент в очереди
    //также может называться poll()
    V dequeue();

    //возвращает первый элемент в очереди, не удаляя его,
    //указатель остается на прежней позиции
    //также может называться peek()
    V front();

    int size();

    boolean isEmpty();
}
