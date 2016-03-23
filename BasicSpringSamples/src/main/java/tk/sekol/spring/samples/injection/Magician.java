package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public abstract class Magician implements Performer {
    private String magicWords;
    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    private MagicBox magicBox;
    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    @Override
    public void perform() {
        System.out.println("Performing magic");
        System.out.println(magicWords);
        System.out.println("Magic box contains " + magicBox.getContent());
        System.out.println("Magic coin " + getMagicCoin().getValue());
    }

    public abstract MagicCoin getMagicCoin();
}
