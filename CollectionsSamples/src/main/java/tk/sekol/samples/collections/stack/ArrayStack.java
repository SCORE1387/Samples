package tk.sekol.samples.collections.stack;

/**
 * LIFO collection (Last-In-First-Out)
 * All methods have O(1) complexity
 * @author kolesnikov
 */
public class ArrayStack<V> implements Stack<V> {

    private static final int DEFAULT_CAPACITY = 5;
    private int capacity;
    private Object[] elements;
    private int current = -1;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    @Override
    @SuppressWarnings("unchecked")
    public V pop() {
        if (isEmpty()) return null;
        return (V) elements[current--];
    }

    @Override
    public boolean push(V o) {
        if (capacity == size()) return false;
        elements[++current] = o;
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public V top() {
        if (isEmpty()) return null;
        return (V) elements[current];
    }

    @Override
    public int size() {
        return current + 1;
    }

    @Override
    public boolean isEmpty() {
        return current == -1;
    }

    public int getCapacity() {
        return capacity;
    }
}
