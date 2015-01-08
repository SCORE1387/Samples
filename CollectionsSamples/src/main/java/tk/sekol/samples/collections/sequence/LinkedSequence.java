package tk.sekol.samples.collections.sequence;

import tk.sekol.samples.collections.Position;

/**
 * @author kolesnikov
 */
//TODO
public class LinkedSequence<V> implements Sequence<V> {
    @Override
    public Position<V> atRank(int rank) {
        return null;
    }

    @Override
    public int rankOf(Position<V> position) {
        return 0;
    }

    @Override
    public Position<V> first() {
        return null;
    }

    @Override
    public Position<V> last() {
        return null;
    }

    @Override
    public boolean isFirst(Position<V> position) {
        return false;
    }

    @Override
    public boolean isLast(Position<V> position) {
        return false;
    }

    @Override
    public Position<V> before(Position<V> position) {
        return null;
    }

    @Override
    public Position<V> after(Position<V> position) {
        return null;
    }

    @Override
    public V replaceElement(Position<V> position, V element) {
        return null;
    }

    @Override
    public V swapElements(Position<V> position1, Position<V> position2) {
        return null;
    }

    @Override
    public Position<V> insertFirst(V element) {
        return null;
    }

    @Override
    public Position<V> insertLast(V element) {
        return null;
    }

    @Override
    public Position<V> insertBefore(Position<V> position, V element) {
        return null;
    }

    @Override
    public Position<V> insertAfter(Position<V> position, V element) {
        return null;
    }

    @Override
    public V remove(Position<V> position) {
        return null;
    }

    @Override
    public V elementAtRank(int rank) {
        return null;
    }

    @Override
    public boolean insertElementAtRank(int rank, V element) {
        return false;
    }

    @Override
    public boolean replaceElementAtRank(int rank, V element) {
        return false;
    }

    @Override
    public boolean removeElementAtRank(int rank) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
