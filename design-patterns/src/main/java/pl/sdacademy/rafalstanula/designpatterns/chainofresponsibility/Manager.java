package pl.sdacademy.rafalstanula.designpatterns.chainofresponsibility;

import java.util.Random;

public class Manager extends Chain {
    private boolean decision = true;

    @Override
    public boolean decide(Level level, boolean proposition) {
        decision = !decision;

        if(level == Level.HIGH && next != null) {
            return next.decide(level, decision);
        }
        System.out.println("Manager:");

        if(proposition != decision && new Random().nextBoolean()) {
            System.out.println("Take proposition:");
            return proposition;
        }
        return decision;
    }
}
