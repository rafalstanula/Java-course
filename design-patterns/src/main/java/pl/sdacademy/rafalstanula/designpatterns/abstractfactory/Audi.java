package pl.sdacademy.rafalstanula.designpatterns.abstractfactory;

public class Audi extends Car {

    public Audi(String nr) {
        super(nr);
    }

    @Override
    public void drive() {
        System.out.println("Driving in Audi, " + nr);
    }
}
