package pl.sdacademy.rafalstanula.designpatterns.abstractfactory;

public class Fiat extends Car{
    public Fiat(String nr) {
        super(nr);
    }

    @Override
    public void drive() {
        System.out.println("Driving in Fiat");
    }
}
