package tk.sekol.samples.java8.streamapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author kolesnikov
 */
public class Samples {

    public static void main(String[] agrs) throws IOException {
        //maps();
        //fileRead();
        //fileSystem();
        //statistics();
        //grouping();
    }

    private static void maps() {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id, val) -> System.out.println(val));


        map.computeIfPresent(3, (num, val) -> val + num);
        System.out.println(map.get(3));

        map.computeIfPresent(9, (num, val) -> null);
        System.out.println(map.containsKey(9));

        map.computeIfAbsent(23, num -> "val" + num);
        System.out.println(map.containsKey(23));

        map.computeIfAbsent(3, num -> "bam");
        System.out.println(map.get(3));


        System.out.println(map.getOrDefault(42, "not found"));

        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));

    }

    private static void fileRead() {
        try (FileReader fr = new FileReader("11.txt"); BufferedReader br = new BufferedReader(fr)) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileSystem() throws IOException {
        Files.list(Paths.get("D:\\"))
                .map(Path::getFileName) // still a path
                .map(Path::toString) // convert to Strings
                .filter(name -> name.endsWith(".java"))
                .sorted() // sort them alphabetically
                .limit(5) // first 5
                .forEach(System.out::println);

        System.out.println(
                Files.lines(Paths.get("D:\\Samples.java"))
                        .map(String::trim)
                        .filter(s -> !s.isEmpty())
                        .collect(Collectors.averagingInt(String::length))
        );

    }

    private static void statistics() throws IOException {
        IntSummaryStatistics stats = Files.lines(Paths.get("D:\\Samples.java"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.summarizingInt(String::length));
        /*IntSummaryStatistics stats = Files.lines(Paths.get("D:\Samples.java"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .mapToInt(String::length)
                .summaryStatistics();*/


        System.out.println(stats.getAverage());
        System.out.println("count=" + stats.getCount());
        System.out.println("max=" + stats.getMax());
        System.out.println("min=" + stats.getMin());

    }

    private static void grouping() {
        List<String> words = Arrays.asList("One", "Two", "Three", "Four", "Eleven");
        Map<Integer, List<String>> wordsByLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(wordsByLength);

        String totalStr = words.stream().reduce("", (a, b) -> a + "_" + b);
        System.out.println(totalStr);
    }


}
