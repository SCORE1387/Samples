package tk.sekol.samples.concurrency.threadlocal;

/**
 * @author kolesnikov
 */
public class Storage {

    private static final ThreadLocal<Integer> var = new ThreadLocal<Integer>();

    public static int getVar() {
        return var.get();
    }

    public static void setVar(int value) {
        var.set(value);
    }
}
