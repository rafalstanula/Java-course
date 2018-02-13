package pl.sdacademy.rafalstanula.designpatterns.iterator;

public class Main {
    public static void main(String[] args) {
        String[] tab = new String[]{"Ala", "ma", "kota"};

        StringIterator iterator = new StringIterator(tab);

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
