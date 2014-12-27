package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Juggler implements Performer {
    private int balls = 3;

    public Juggler() {
    }

    public Juggler(int balls) {
        this.balls = balls;
    }

    @Override
    public void perform() {
        System.out.println("Juggling " + balls + " balls");
    }
}
