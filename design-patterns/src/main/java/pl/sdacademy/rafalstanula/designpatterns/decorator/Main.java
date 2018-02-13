package pl.sdacademy.rafalstanula.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Motto motto = new ExclamationMarkDecorator(new DayMotto());

        System.out.println(motto.getMotto());
    }
}