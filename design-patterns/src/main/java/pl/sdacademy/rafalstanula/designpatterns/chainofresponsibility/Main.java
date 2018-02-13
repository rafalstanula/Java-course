package pl.sdacademy.rafalstanula.designpatterns.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Manager manager = new Manager();
        Boss boss = new Boss();

        worker.setNext(manager);
        manager.setNext(boss);

        System.out.println(worker.decide(Chain.Level.LOW));
        System.out.println(worker.decide(Chain.Level.MEDIUM));
        System.out.println(worker.decide(Chain.Level.HIGH));
    }
}
