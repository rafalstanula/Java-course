package pl.sdacademy.rafalstanula.designpatterns.chainofresponsibility;

import java.util.Random;

public class Worker extends Chain {

    public boolean decide(Level level) {
        return decide(level, true);
    }
                          @Override
    public boolean decide(Level level, boolean proposition) {
        boolean decision = new Random().nextBoolean();
        if(level != Level.LOW && next != null) {
            return next.decide(level, decision);
        }
        System.out.println("Worker:");

        if(proposition != decision && new Random().nextBoolean()) {
            System.out.println("Take proposition:");
            return proposition;
        }
        return decision;
    }
}
