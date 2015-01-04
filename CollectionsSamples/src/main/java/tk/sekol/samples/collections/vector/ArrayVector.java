package tk.sekol.samples.collections.vector;

import java.util.Arrays;

/**
 * @author kolesnikov
 */
public class ArrayVector<V> implements Vector<V> {
    private static final int DEFAULT_CAPACITY = 16;

    private Object[] elements;
    private int capacity;
    private int elementsCount = 0;

    public ArrayVector() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayVector(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    @Override
    @SuppressWarnings("unchecked")
    public V elementAtRank(int rank) {
        return (V) elements[rank];
    }

    @Override
    public boolean insertElementAtRank(int rank, V element) {
        if (rank < 0 || rank > elementsCount) return false;
        ensureCapacity(elementsCount + 1);
        for (int i = elementsCount - 1; i >= rank; i--)
            elements[i + 1] = elements[i];
        elements[rank] = element;
        elementsCount++;
        return false;
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity >= capacity) {
            Object[] newElements = new Object[capacity * 2];
            for (int i = 0; i < capacity; i++)
                newElements[i] = elements[i];
            elements = newElements;
            capacity = capacity * 2;
        }
    }

    @Override
    public boolean replaceElementAtRank(int rank, V element) {
        if (rank < 0 || rank > elementsCount) return false;
        elements[rank] = element;
        return true;
    }

    @Override
    public boolean removeElementAtRank(int rank) {
        if (rank < 0 || rank > elementsCount) return false;
        for (int i = rank; i < elementsCount; i++)
            elements[i] = elements[i + 1];
        elements[elementsCount] = null;
        elementsCount--;
        return true;
    }

    @Override
    public int size() {
        return elementsCount;
    }

    @Override
    public boolean isEmpty() {
        return elementsCount == 0;
    }

    @Override
    public String toString() {
        return "ArrayVector{" +
            "elements=" + Arrays.toString(elements) +
            ", capacity=" + capacity +
            ", elementsCount=" + elementsCount +
            '}';
    }
}
