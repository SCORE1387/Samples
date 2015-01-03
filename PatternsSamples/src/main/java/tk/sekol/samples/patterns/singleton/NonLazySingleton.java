package tk.sekol.samples.patterns.singleton;

/**
 * @author kolesnikov
 */
public class NonLazySingleton {

    public static final NonLazySingleton INSTANCE = new NonLazySingleton();

    public void doSmth() {
        System.out.println("test");
    }

}
