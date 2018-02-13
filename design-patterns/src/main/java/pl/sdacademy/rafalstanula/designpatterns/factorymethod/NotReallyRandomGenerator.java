package pl.sdacademy.rafalstanula.designpatterns.factorymethod;

public class NotReallyRandomGenerator implements Generator {
    @Override
    public int random() {
        return 4;
    }
}
