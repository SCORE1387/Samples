package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("piano piano ");
    }
}
