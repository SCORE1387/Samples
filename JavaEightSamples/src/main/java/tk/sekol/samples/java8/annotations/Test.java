package tk.sekol.samples.java8.annotations;

import java.util.Arrays;

/**
 * @author kolesnikov
 */
public class Test {

    public static void main(String[] agrs) {
        AnnotatedClass annotated = new AnnotatedClass();

        Listen[] annotations = annotated.getClass().getAnnotationsByType(Listen.class);
        Arrays.asList(annotations).forEach(listen -> System.out.println(listen.value()));
    }

}
