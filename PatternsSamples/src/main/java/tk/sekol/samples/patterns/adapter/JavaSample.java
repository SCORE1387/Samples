package tk.sekol.samples.patterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kolesnikov
 */
public class JavaSample {

    public static void main(String[] agrs) {
        int[] monthNums = getArray();
        List<Integer> monthNumsList = new ArrayList<>();
        for (int i = 1; i < monthNums.length; i++) {
            monthNumsList.add(monthNums[i]);
        }
        doSmthWithList(monthNumsList);
        doSmthWithList(Arrays.asList(monthNums));
    }









    private static int[] getArray() {
        return new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
    }

    private static void doSmthWithList(List list) {
        System.out.println(list);
    }

}
