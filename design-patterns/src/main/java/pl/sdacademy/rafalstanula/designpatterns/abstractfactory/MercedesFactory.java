package pl.sdacademy.rafalstanula.designpatterns.abstractfactory;

public class MercedesFactory implements CarFactory {
    @Override
    public Car create(String nr) {
        return new Mercedes(nr);
    }
}
