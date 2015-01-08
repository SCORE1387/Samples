package tk.sekol.samples.collections.list;

import tk.sekol.samples.collections.Position;

/**
 * @author kolesnikov
 */
public interface List<V> {
    Position<V> first();
    Position<V> last();
    boolean isFirst(Position<V> position);
    boolean isLast(Position<V> position);
    Position<V> before(Position<V> position);
    Position<V> after(Position<V> position);

    V replaceElement(Position<V> position, V element);
    V swapElements(Position<V> position1, Position<V> position2);
    Position<V> insertFirst(V element);
    Position<V> insertLast(V element);
    Position<V> insertBefore(Position<V> position, V element);
    Position<V> insertAfter(Position<V> position, V element);
    V remove(Position<V> position);

    boolean isEmpty();
    int size();
}
