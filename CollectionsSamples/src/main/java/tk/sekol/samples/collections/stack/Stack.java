package tk.sekol.samples.collections.stack;

/**
 * LIFO collection (Last-In-First-Out)
 * @see tk.sekol.samples.collections.stack.ArrayStack
 * @author kolesnikov
 */
public interface Stack<V> {

    boolean push(V o);

    V pop();

    V top();

    int size();

    boolean isEmpty();
}
