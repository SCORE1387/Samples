package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Instrumentalist implements Performer {

    Instrument instrument;
    String song;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public String getSong() {
        return song;
    }

    @Override
    public void perform() {
        System.out.println("Playing song " + song + " on instrument");
        instrument.play();
    }
}
