package pl.sdacademy.rafalstanula.designpatterns;

import pl.sdacademy.rozkocha.szymon.designpatterns.strategy.*;

public class Main {
    private static final String EXIT = "q";

    public static void main(String[] args) {
        Singleton.get().doSomething();

        //Person szymon = new Person("Szymon", "Rozkocha", "14533efws", "Kraków", 173, true);

        /*Person szymon = new Person();
        szymon.setName("Szymon");*/

        Person szymon = Person.builder()
                .name("Szymon")
                .surname("Rozkocha")
                .id("14533efws")
                .address(Address.builder()
                        .street("Street")
                        .city("City")
                        .build()
                ).height(173)
                .adult(true)
                .build();

        /*CarFactory factory = new MercedesFactory();

        Car car1 = factory.create("aaaa");
        Car car2 = factory.create("bbbb");

        car1.drive();
        car2.drive();*/

        /*ChangePolishChars changePolishChars = new QuickSortChangePolishChars();

        List<String> strings = changePolishChars.change(Arrays.asList("Esdfsdfsdfów", "Asdfsądf"));

        System.out.println(strings);*/

        /*Numbers numbers = new AvgNumbers();

        System.out.println(numbers.compute(Arrays.asList(12, 41, 78, 5, -2)));*/

        /*Observable observable = new Observable();
        observable.register(new PrintObserver());
        observable.register(new PrintUppercaseObserver());

        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            line = scanner.nextLine();

            observable.noticeAll(line.charAt(0));
        } while(!EXIT.equals(line));

        */
    }
}