package pl.sdacademy.rafalstanula.designpatterns.abstractfactory;

public abstract class Car {
    protected String nr;

    public Car(String nr) {
        this.nr = nr;
    }

    public abstract void drive();
}
