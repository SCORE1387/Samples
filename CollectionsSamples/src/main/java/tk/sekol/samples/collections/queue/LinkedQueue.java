package tk.sekol.samples.collections.queue;

/**
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

    private class Node<V> {
        private V object = null;
        private Node<V> next = null;

        public Node() {
        }

        public Node(V object, Node<V> next) {
            this.object = object;
            this.next = next;
        }

        public V getObject() {
            return object;
        }

        public void setObject(V object) {
            this.object = object;
        }

        public Node<V> getNext() {
            return next;
        }

        public void setNext(Node<V> next) {
            this.next = next;
        }
    }
}
