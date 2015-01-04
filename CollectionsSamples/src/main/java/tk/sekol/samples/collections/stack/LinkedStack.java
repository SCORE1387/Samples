package tk.sekol.samples.collections.stack;

/**
 * @author kolesnikov
 */
public class LinkedStack<V> implements Stack<V> {

    private Node<V> top = null;
    private int size = 0;

    @Override
    public boolean push(V o) {
        Node<V> newNode = new Node<>(o, top);
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
