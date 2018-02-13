package pl.sdacademy.rafalstanula.designpatterns.chainofresponsibility;

public abstract class Chain {
    public enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    protected Chain next;

    public void setNext(Chain next) {
        this.next = next;
    }

    public abstract boolean decide(Level level, boolean proposition);
}
