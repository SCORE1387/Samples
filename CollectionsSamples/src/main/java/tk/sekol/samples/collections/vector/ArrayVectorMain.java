package tk.sekol.samples.collections.vector;

/**
 * @author kolesnikov
 */
public class ArrayVectorMain {

    public static void main(String[] agrs) {
        Vector<String> vector = new ArrayVector<>();
        for (int i = 0; i < 15; i++)
            vector.insertElementAtRank(i, String.valueOf(i));
        System.out.println(vector);

        vector.insertElementAtRank(15, "15");
        System.out.println(vector);

        vector.insertElementAtRank(16, "16");
        System.out.println(vector);

        vector.insertElementAtRank(7, "7`");
        System.out.println(vector);

        vector.removeElementAtRank(8);
        System.out.println(vector);

        vector.replaceElementAtRank(10, "10`");
        System.out.println(vector);
    }

}
