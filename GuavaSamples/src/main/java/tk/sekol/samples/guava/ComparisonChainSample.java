package tk.sekol.samples.guava;

import com.google.common.collect.ComparisonChain;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author kolesnikov
 */
public class ComparisonChainSample {

    public static void main(String[] agrs) {
        SortedSet persons = new TreeSet() {{
            add(new PersonInfo("Bill", 26, GROUP.STUDENT));
            add(new PersonInfo("Jane", 19, GROUP.STUDENT));
            add(new PersonInfo("Jane", 21, GROUP.STUDENT));
            add(new PersonInfo("Bill", 26, GROUP.TEACHER));
        }};

        System.out.println(persons);
    }

    private static class PersonInfo implements Comparable<PersonInfo>{
        private String name;
        private int age;
        private GROUP group;

        public PersonInfo(String name, int age, GROUP group) {
            this.name = name;
            this.age = age;
            this.group = group;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public GROUP getGroup() {
            return group;
        }

        public void setGroup(GROUP group) {
            this.group = group;
        }

        @Override
        public String toString() {
            return "PersonInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                "}\n";
        }

        @Override
        public int compareTo(PersonInfo o) {
            return ComparisonChain.start()
                .compare(this.name, o.getName())
                .compare(this.age, o.getAge()).compare(this.group, o.getGroup(), GROUP.GROUP_COMPARATOR)
                .result();
        }
    }

    public enum GROUP {
        TEACHER(1), STUDENT(2);

        private int priority;

        GROUP(int priority) {
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }

        public static final Comparator<GROUP> GROUP_COMPARATOR = (o1, o2) -> Integer.compare(o1.getPriority(), o2.getPriority());

    }

}
