package tk.sekol.samples.collections.vector;

/**
 * @author kolesnikov
 */
public interface Vector<V> {
    V elementAtRank(int rank);
    boolean insertElementAtRank(int rank, V element);
    boolean replaceElementAtRank(int rank, V element);
    boolean removeElementAtRank(int rank);
    int size();
    boolean isEmpty();
}
