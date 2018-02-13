package pl.sdacademy.rafalstanula.designpatterns.observer;

public class PrintUppercaseObserver implements Observer {

    @Override
    public void notice(char c) {
        System.out.println(Character.toUpperCase(c));
    }
}
