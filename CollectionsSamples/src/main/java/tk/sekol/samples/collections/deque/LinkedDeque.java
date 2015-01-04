package tk.sekol.samples.collections.deque;

/**
 * based on two-way linked list idea
 * @author kolesnikov
 */
public class LinkedDeque<V> implements Deque<V> {

    private Node<V> head = null;
    private Node<V> tail = null;
    private int size = 0;

    @Override
    public void insertFirst(V element) {
        Node<V> newNode = new Node<>();
        newNode.setElement(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            head.setNext(newNode);
            newNode.setPrev(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public void insertLast(V element) {
        Node<V> newNode = new Node<>();
        newNode.setElement(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setPrev(newNode);
            newNode.setNext(tail);
            tail = newNode;
        }
        size++;
    }

    @Override
    public V removeFirst() {
        if (isEmpty()) return null;
        V result = head.getElement();
        head.getPrev().setNext(null);
        head = head.getPrev();
        return result;
    }

    @Override
    public V removeLast() {
        if (isEmpty()) return null;
        V result = tail.getElement();
        tail.getNext().setPrev(null);
        tail = tail.getNext();
        return result;
    }

    @Override
    public V first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    @Override
    public V last() {
        if (isEmpty()) return null;
        return tail.getElement();
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
        private T element;
        private Node<T> prev;
        private Node<T> next;

        public Node() {
        }

        public Node(T element, Node<T> prev, Node<T> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
