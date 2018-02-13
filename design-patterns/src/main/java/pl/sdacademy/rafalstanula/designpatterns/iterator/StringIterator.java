package pl.sdacademy.rafalstanula.designpatterns.iterator;

public class StringIterator {
    private String[] tab;
    private int index = -1;

    public StringIterator(String[] tab) {
        this.tab = tab;
    }

    public boolean hasNext() {
        return index < (tab.length - 1);
    }

    public String next() {
        ++index;
        return tab[index];
    }
}
