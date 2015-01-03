package tk.sekol.samples.patterns.iterator;

public class SkipList implements List {

    @Override
    public Iterator createIterator() {
        return new SkipIterator(this);
    }

    @Override
    public void add() {
        System.out.println("added");
    }

    @Override
    public void clear() {
        System.out.println("clear");
    }
}
