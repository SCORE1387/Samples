package tk.sekol.samples.collections.stack;

/**
 * LIFO collection (Last-In-First-Out)
 * @see tk.sekol.samples.collections.stack.ArrayStack
 * @author kolesnikov
 */
public interface Stack<V> {

    V pop();

    boolean push(V o);

    V top();

    int size();

    boolean isEmpty();
}
