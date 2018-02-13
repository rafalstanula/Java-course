package pl.sdacademy.rafalstanula.designpatterns.abstractfactory;

public class AudiFactory implements CarFactory {
    @Override
    public Car create(String nr) {
        return new Audi(nr);
    }
}
