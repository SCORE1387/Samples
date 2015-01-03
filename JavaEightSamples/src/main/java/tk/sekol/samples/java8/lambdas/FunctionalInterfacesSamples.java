package tk.sekol.samples.java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author kolesnikov
 */
public class FunctionalInterfacesSamples {

    public static void main(String[] agrs) {
        functionalInterfaces();
    }

    private static void functionalInterfaces() {
        Predicate<String> strLengthMoreZero = s -> s.length() > 0;
        Function<String, Integer> strToIntFunc = Integer::parseInt;

        System.out.println(strLengthMoreZero.test(""));

        List<String> stringList = Arrays.asList("3", "4", "12", "", "12");
        stringList.stream().filter(strLengthMoreZero).map(strToIntFunc).forEach(System.out::println);

        // Java 7
        for (String s : stringList) {
            System.out.println(s);
        }

    }

}
