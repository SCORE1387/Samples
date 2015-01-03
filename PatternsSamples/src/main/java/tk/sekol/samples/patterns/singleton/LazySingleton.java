package tk.sekol.samples.patterns.singleton;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static  synchronized  LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }

    public void doSmth() {
        System.out.println("test");
    }

}
