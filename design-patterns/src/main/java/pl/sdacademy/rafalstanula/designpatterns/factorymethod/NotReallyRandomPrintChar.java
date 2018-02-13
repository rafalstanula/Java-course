package pl.sdacademy.rafalstanula.designpatterns.factorymethod;

public class NotReallyRandomPrintChar extends PrintChar{
    @Override
    protected Generator createGenerator() {
        return new NotReallyRandomGenerator();
    }
}
