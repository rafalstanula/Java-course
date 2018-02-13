package pl.sdacademy.rafalstanula.designpatterns.factorymethod;

import java.util.Random;

public class JavaGenerator implements Generator {

    @Override
    public int random() {
        return new Random().nextInt(41) + 20;
    }
}
