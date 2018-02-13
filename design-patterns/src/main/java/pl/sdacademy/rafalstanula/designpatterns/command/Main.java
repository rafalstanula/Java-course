package pl.sdacademy.rafalstanula.designpatterns.command;

import java.util.*;

public class Main {
    private static final String EXIT = "q";

    public static void main(String[] args) {
        Map<String, Command> commands = new HashMap<>();
        commands.put("repeat", new RepeatCommand());
        commands.put("add", new CalculatorCommand());

        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            line = scanner.nextLine();

            List<String> strings = Arrays.asList(line.split(" "));

            String commandName = strings.get(0);

            if (commands.containsKey(commandName)) {
                Command command = commands.get(commandName);
                command.run(strings.subList(1, strings.size()));
            }
        } while (!EXIT.equals(line));
    }
}
