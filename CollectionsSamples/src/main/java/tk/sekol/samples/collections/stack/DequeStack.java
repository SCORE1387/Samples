package tk.sekol.samples.collections.stack;

import tk.sekol.samples.collections.deque.Deque;
import tk.sekol.samples.collections.deque.LinkedDeque;

/**
 * @author kolesnikov
 */
public class DequeStack<V> implements Stack<V> {
    private Deque<V> deque;

    public DequeStack() {
        deque = new LinkedDeque<>();
    }

    @Override
    public boolean push(V o) {
        deque.insertLast(o);
        return true;
    }

    @Override
    public V pop() {
        return deque.removeLast();
    }

    @Override
    public V top() {
        return deque.last();
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
