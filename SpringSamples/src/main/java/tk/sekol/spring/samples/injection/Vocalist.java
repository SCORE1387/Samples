package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Vocalist implements Performer {
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() {
        System.out.println("Vocalist singing song " + song);
    }
}
