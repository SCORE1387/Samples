package tk.sekol.samples.java8.annotations;

import java.lang.annotation.Repeatable;

/**
 * @author kolesnikov
 */
@Repeatable(Listens.class)
public @interface Listen {
    String value();
}
