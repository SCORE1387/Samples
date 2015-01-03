package tk.sekol.samples.patterns.iterator;

public class SkipIterator implements Iterator {
    private List list;

    public SkipIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        return null;
    }
}
