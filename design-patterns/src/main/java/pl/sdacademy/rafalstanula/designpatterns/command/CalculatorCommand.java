package pl.sdacademy.rafalstanula.designpatterns.command;

import java.util.List;

public class CalculatorCommand implements Command {
    @Override
    public void run(List<String> args) {
        int a = Integer.parseInt(args.get(0));
        int b = Integer.parseInt(args.get(1));
        System.out.println(a + b);
    }
}
