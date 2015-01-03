package tk.sekol.samples.patterns.factorymethod;

public class PictureDocument implements Document  {

    @Override
    public void open() {
        System.out.println("Picture open");
    }

    @Override
    public void save() {
        System.out.println("Picture save");
    }

    @Override
    public void close() {
        System.out.println("Picture close");
    }

}
