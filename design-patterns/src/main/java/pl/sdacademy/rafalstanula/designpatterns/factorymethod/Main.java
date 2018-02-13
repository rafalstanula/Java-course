package pl.sdacademy.rafalstanula.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        PrintChar printChar = new NotReallyRandomPrintChar();

        printChar.print('a');
    }
}
