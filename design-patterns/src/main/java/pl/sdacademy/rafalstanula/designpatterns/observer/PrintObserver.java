package pl.sdacademy.rafalstanula.designpatterns.observer;

public class PrintObserver implements Observer {
    @Override
    public void notice(char c) {
        System.out.println(c);
    }
}
