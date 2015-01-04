package tk.sekol.samples.collections.queue;

/**
 * Queue implementation based on linked list
 * All methods have complexity O(1)
 * Element removal from linked list tail has complexity O(n) that`s why it is not used
 * @author kolesnikov
 */
public class LinkedQueue<V> implements Queue<V> {

    private Node<V> head = null;
    private Node<V> tail = null;
    private int size = 0;

    @Override
    public boolean enqueue(V o) {
        Node<V> newNode = new Node<>();
        newNode.setObject(o);
        if (head == null) head = newNode;
        if (tail != null) tail.setNext(newNode);
        tail = newNode;
        size++;
        return true;
    }

    @Override
    public V dequeue() {
        if (isEmpty()) return null;
        V result = head.getObject();
        head = head.getNext();
        size--;
        if (isEmpty()) tail = null;
        return result;
    }

    @Override
    public V front() {
        return head.getObject();
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
