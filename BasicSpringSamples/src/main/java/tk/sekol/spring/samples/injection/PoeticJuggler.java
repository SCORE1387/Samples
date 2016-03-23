package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int balls, Poem poem) {
        super(balls);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("while reciting...");
        System.out.println(poem.recite());
    }
}
