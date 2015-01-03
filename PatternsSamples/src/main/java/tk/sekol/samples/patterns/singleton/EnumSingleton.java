package tk.sekol.samples.patterns.singleton;

/**
 * @author kolesnikov
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSmth() {
        System.out.println("test");
    }

}
