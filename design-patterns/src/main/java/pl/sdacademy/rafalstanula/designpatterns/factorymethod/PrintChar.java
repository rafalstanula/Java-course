package pl.sdacademy.rafalstanula.designpatterns.factorymethod;

import org.apache.commons.lang.StringUtils;

public abstract class PrintChar {
    public void print(char c) {
        Generator generator = createGenerator();
        int number = generator.random();

        System.out.println(StringUtils.repeat(String.valueOf(c), number));
    }

    protected abstract Generator createGenerator();
}
