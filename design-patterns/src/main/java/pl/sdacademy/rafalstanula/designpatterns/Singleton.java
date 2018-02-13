package pl.sdacademy.rafalstanula.designpatterns;

public class Singleton {
    private static final Singleton instance = new Singleton();

    public static Singleton get() {
        return instance;
    }

    private Singleton() {

    }

    public void doSomething() {
        System.out.println("something!");
    }
}
