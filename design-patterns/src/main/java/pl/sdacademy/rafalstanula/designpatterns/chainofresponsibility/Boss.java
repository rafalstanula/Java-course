package pl.sdacademy.rafalstanula.designpatterns.chainofresponsibility;

import java.util.Random;

public class Boss extends Chain {
    @Override
    public boolean decide(Level level, boolean proposition) {
        System.out.println("Boss:");
        if(!proposition && new Random().nextBoolean()) {
            System.out.println("Take proposition:");
            return false;
        }
        return true;
    }
}
