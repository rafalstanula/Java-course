package pl.sdacademy.rafalstanula.designpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Memento string = new Memento();
        string.set("Ala", 1);
        string.set("ma", 2);
        string.set("kota" ,3);
        string.undo();
        //string.undo();

        System.out.println(string);
    }
}
