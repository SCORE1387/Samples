package tk.sekol.samples.patterns.factorymethod;

public class TextDocument implements Document {

    @Override
    public void open() {
        System.out.println("Text open");
    }

    @Override
    public void save() {
        System.out.println("Text save");
    }

    @Override
    public void close() {
        System.out.println("Text close");
    }

}
