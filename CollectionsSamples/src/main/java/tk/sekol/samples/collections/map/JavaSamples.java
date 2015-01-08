package tk.sekol.samples.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author kolesnikov
 */
public class JavaSamples {

    public static void main(String[] agrs) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new TreeMap<>();
        Map<Integer, String> map3 = new LinkedHashMap<>();
        //IdentityHashMap ???
        //EnumMap ???
        //WeakHashMap ???
        map1.put(1, "1");
        map1.put(15, "15");
        map1.put(2, "2");
        map1.put(4, "4");
        map1.put(3, "3");
        map2.put(1, "1");

        map2.put(15, "15");
        map2.put(2, "2");
        map2.put(4, "4");
        map2.put(3, "3");
        map3.put(1, "1");

        map3.put(15, "15");
        map3.put(2, "2");
        map3.put(4, "4");
        map3.put(3, "3");

        System.out.println("HashMap: ");
        System.out.println(map1);

        System.out.println("TreeMap: ");
        System.out.println(map2);

        System.out.println("LinkedHashMap: ");
        System.out.println(map3);
    }

}
