package pl.sdacademy.rafalstanula.designpatterns.factorymethod;

public class JavaPrintChar extends PrintChar {
    @Override
    protected Generator createGenerator() {
        return new JavaGenerator();
    }
}
