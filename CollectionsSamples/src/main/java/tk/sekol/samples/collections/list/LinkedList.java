package tk.sekol.samples.collections.list;

import tk.sekol.samples.collections.Position;

/**
 * List based on double-linked list
 * All methods have O(1) complexity
 * @author kolesnikov
 */
public class LinkedList<V> implements List<V> {

    private Node<V> head;
    private Node<V> tail;
    private int elementsCount;

    @Override
    public Position<V> first() {
        return head;
    }

    @Override
    public Position<V> last() {
        return tail;
    }

    @Override
    public boolean isFirst(Position<V> position) {
        return head == position;
    }

    @Override
    public boolean isLast(Position<V> position) {
        return tail == position;
    }

    @Override
    public Position<V> before(Position<V> position) {
        Node<V> node = checkPosition(position);
        return node.getPrev();
    }

    @Override
    public Position<V> after(Position<V> position) {
        Node<V> node = checkPosition(position);
        return node.getNext();
    }

    @Override
    public V replaceElement(Position<V> position, V element) {
        V prevElement = position.element();
        Node<V> node = checkPosition(position);
        node.setElement(element);
        return prevElement;
    }

    @Override
    public V swapElements(Position<V> position1, Position<V> position2) {
        return null;
    }

    @Override
    public Position<V> insertFirst(V element) {
        Node<V> newNode = new Node<>(element, null, head);
        head.setPrev(newNode);
        head = newNode;
        return newNode;
    }

    @Override
    public Position<V> insertLast(V element) {
        Node<V> newNode = new Node<>(element, tail, null);
        tail.setNext(newNode);
        tail = newNode;
        return newNode;
    }

    @Override
    public Position<V> insertBefore(Position<V> position, V element) {
        Node<V> node = checkPosition(position);
        Node<V> newNode = new Node<>(element, node.getPrev(), node);
        node.getPrev().setNext(newNode);
        node.setPrev(newNode);
        return newNode;
    }

    @Override
    public Position<V> insertAfter(Position<V> position, V element) {
        Node<V> node = checkPosition(position);
        Node<V> newNode = new Node<>(element, node, node.getNext());
        node.getNext().setPrev(newNode);
        node.setNext(newNode);
        return newNode;
    }

    @Override
    public V remove(Position<V> position) {
        V element = position.element();
        Node<V> node = checkPosition(position);
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        return element;
    }

    private Node<V> checkPosition(Position<V> position) {
        return (Node<V>) position; //TODO
    }

    @Override
    public boolean isEmpty() {
        return elementsCount <= 0;
    }

    @Override
    public int size() {
        return elementsCount;
    }

    private class Node<T> implements Position<T>{
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

        @Override
        public T element() {
            return getElement();
        }
    }
}
