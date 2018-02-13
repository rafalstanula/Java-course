package pl.sdacademy.rafalstanula.designpatterns.composite;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new Processor(), new HardDrive(), new Monitor());

        computer.tick();
    }
}