package tk.sekol.samples.collections.queue;

import tk.sekol.samples.collections.deque.Deque;
import tk.sekol.samples.collections.deque.LinkedDeque;

/**
 * @author kolesnikov
 */
public class DequeQueue<V> implements Queue<V> {
    private Deque<V> deque;

    public DequeQueue() {
        deque = new LinkedDeque<>();
    }

    @Override
    public boolean enqueue(V o) {
        deque.insertLast(o);
        return true;
    }

    @Override
    public V dequeue() {
        return deque.removeFirst();
    }

    @Override
    public V front() {
        return deque.first();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
