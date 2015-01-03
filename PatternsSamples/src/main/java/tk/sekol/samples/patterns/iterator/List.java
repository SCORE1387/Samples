package tk.sekol.samples.patterns.iterator;

public interface List {

    public abstract Iterator createIterator();
    public abstract void add();
    public abstract void clear();

}
