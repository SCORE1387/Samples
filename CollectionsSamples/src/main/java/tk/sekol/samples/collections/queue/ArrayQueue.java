package tk.sekol.samples.collections.queue;

import java.util.Arrays;

/**
 * FIFO collection (First-In-First-Out)
 * All methods have O(1) complexity
 * @author kolesnikov
 */
public class ArrayQueue<V> implements Queue<V> {

    private static final int DEFAULT_CAPACITY = 3;
    private Object[] elements;
    private int capacity;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    @Override
    public boolean enqueue(V o) {
        if (size() == capacity) return false;
        elements[tail % capacity] = o;
        tail++;
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public V dequeue() {
        if (isEmpty()) return null;
        V result = (V) elements[head % capacity];
        elements[head % capacity] = null;
        head++;
        return result;
    }

    @Override
    @SuppressWarnings("unchecked")
    public V front() {
        if (isEmpty()) return null;
        return (V) elements[head % capacity];
    }

    @Override
    public int size() {
        return tail - head;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
            "elements=" + Arrays.toString(elements) +
            ", head=" + head +
            ", tail=" + tail +
            '}';
    }
}
