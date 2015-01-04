package tk.sekol.samples.collections.stack;

/**
 * Stack implementation based on linked list
 * All methods have complexity O(1)
 * @author kolesnikov
 */
public class LinkedStack<V> implements Stack<V> {

    private Node<V> top = null;
    private int size = 0;

    @Override
    public boolean push(V o) {
        Node<V> newNode = new Node<>();
        newNode.setObject(o);
        if (top != null) newNode.setNext(top);
        top = newNode;
        size++;
        return true;
    }

    @Override
    public V pop() {
        if (isEmpty()) return null;
        V result = top.getObject();
        top = top.getNext();
        size--;
        return result;
    }

    @Override
    public V top() {
        if (isEmpty()) return null;
        return top.getObject();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    private class Node<T> {
        private T object = null;
        private Node<T> next = null;

        public Node() {
        }

        public Node(T object, Node<T> next) {
            this.object = object;
            this.next = next;
        }

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
