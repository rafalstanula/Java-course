package pl.sdacademy.rafalstanula.designpatterns.abstractfactory;

public class FiatFactory implements CarFactory {

    @Override
    public Car create(String nr) {
        return new Fiat(nr);
    }
}
