package tk.sekol.samples.collections.sequence;

import tk.sekol.samples.collections.Position;
import tk.sekol.samples.collections.list.List;
import tk.sekol.samples.collections.vector.Vector;

/**
 * Two implementations of Sequence interface are possible: based on LinkedList and Based on Array
 * <table summary="">
 *   <tr>
 *      <td>Operation</td><td>Array</td><td>Linked List</td>
 *   </tr>
 *   <tr>
 *      <td>size(), isEmpty()</td><td>O(1)</td><td>O(1)</td>
 *   </tr>
 *   <tr>
 *      <td>atRank(..), rankOf(..), elemAtRank(..)</td><td>O(1)</td><td>O(n)</td>
 *   </tr>
 *   <tr>
 *      <td>first(..), last(..), before(..), after(..)</td><td>O(1)</td><td>O(1)</td>
 *   </tr>
 *   <tr>
 *      <td>replaceElement(..), swapElements(..)</td><td>O(1)</td><td>O(1)</td>
 *   </tr>
 *   <tr>
 *      <td>replaceAtRank(..)</td><td>O(1)</td><td>O(n)</td>
 *   </tr>
 *   <tr>
 *      <td>insertAtRank(..), removeAtRank(..)</td><td>O(n)</td><td>O(n)</td>
 *   </tr>
 *   <tr>
 *      <td>insertFirst(..), insertLast(..)</td><td>O(1)</td><td>O(1)</td>
 *   </tr>
 *   <tr>
 *      <td>insertAfter(..), insertBefore(..)</td><td>O(n)</td><td>O(1)</td>
 *   </tr>
 *   <tr>
 *      <td>remove(..)</td><td>O(n)</td><td>O(1)</td>
 *   </tr>
 * </table>
 * @author kolesnikov
 */
public interface Sequence<V> extends Vector<V>, List<V> {
    Position<V> atRank(int rank);
    int rankOf(Position<V> position);
}
