package tk.sekol.samples.concurrency.threadlocal;

/**
 * @author kolesnikov
 */
public class Task implements Runnable {

    private final ThreadLocal<Integer> var = new ThreadLocal<Integer>();

    public Task(int var) {
        setVar(var);
    }

    @Override
    public void run() {

    }

    public int getVar() {
        return var.get();
    }

    public void setVar(int var) {
        this.var.set(var);
    }
}
