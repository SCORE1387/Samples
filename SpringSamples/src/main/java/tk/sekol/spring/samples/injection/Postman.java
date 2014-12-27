package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Postman {
    private Letter letter;

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Postman{" +
            "letter=" + letter.getContent() +
            '}';
    }
}
