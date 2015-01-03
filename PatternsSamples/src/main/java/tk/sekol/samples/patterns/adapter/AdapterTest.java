package tk.sekol.samples.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        Manager manager = new DevManager();
        manager.askForDevFeature("Blablabla");
    }

}
