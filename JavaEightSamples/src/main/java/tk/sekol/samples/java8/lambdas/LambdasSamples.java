package tk.sekol.samples.java8.lambdas;

import java.util.*;

/**
 * @author kolesnikov
 */
public class LambdasSamples {

    public static void main(String[] agrs) {
        lambdasSort();
        customLambdas();
        methodReferences();
        extendedSort();
    }

    private static void lambdasSort() {
        List<String> stringList = Arrays.asList("One", "Two", "Three", "Four");

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str2.length(), str1.length());
            }
        });


        System.out.println(stringList);
    }

    private static void customLambdas() {
        ILambdasTest interfaceImpl = new ILambdasTest() {
            @Override
            public void test() {
                System.out.println("Test");
            }
        };

        LambdasClass.doTest(new ILambdasTest() {
            @Override
            public void test() {
                System.out.println("Test1");
            }
        });
    }

    public interface ILambdasTest {
        void test();
    }

    public static class LambdasClass {
        public static void doTest(ILambdasTest iLambdasTest) {
            iLambdasTest.test();
        }
    }

    private static void methodReferences() {
        List<String> stringList = Arrays.asList("One", "Two", "Three", "Four");

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });
    }


    private static void extendedSort() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bob", "Dylan"));
        persons.add(new Person("Vova", "Putin"));

        // Java 7
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int n = p1.getLastName().compareTo(p2.getLastName());
                if (n == 0) {
                    return p1.getFirstName().compareTo(p2.getFirstName());
                }
                return n;
            }
        });
        // Java 8
        persons.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
    }

    private static class Person {
        String firstName;
        String lastName;

        private Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
