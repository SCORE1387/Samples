package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class ConcretePoem implements Poem {
    @Override
    public String recite() {
        return "text of poem";
    }
}
