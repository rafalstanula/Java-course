package pl.sdacademy.rafalstanula.designpatterns.observer;

import java.util.Collection;
import java.util.LinkedList;

public class Observable {
    private Collection<Observer> observers = new LinkedList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void noticeAll(char c) {
        observers.forEach(observer -> observer.notice(c));
    }
}
