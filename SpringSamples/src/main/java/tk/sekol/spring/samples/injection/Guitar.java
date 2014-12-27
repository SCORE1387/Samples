package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("guitar guitar");
    }
}
