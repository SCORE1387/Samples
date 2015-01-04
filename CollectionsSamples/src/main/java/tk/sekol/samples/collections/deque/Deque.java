package tk.sekol.samples.collections.deque;

/**
 * Double-ended queue
 * @author kolesnikov
 */
public interface Deque<V> {
    void insertFirst(V element);
    void insertLast(V element);
    V removeFirst();
    V removeLast();

    V first();
    V last();

    int size();
    boolean isEmpty();
}
