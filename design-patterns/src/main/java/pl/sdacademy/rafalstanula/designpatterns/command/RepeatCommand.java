package pl.sdacademy.rafalstanula.designpatterns.command;

import java.util.List;

public class RepeatCommand implements Command {

    @Override
    public void run(List<String> args) {
        String word = args.get(0);
        int n = Integer.parseInt(args.get(1));

        for (int i = 0; i < n; ++i) {
            System.out.println(word);
        }
    }
}
