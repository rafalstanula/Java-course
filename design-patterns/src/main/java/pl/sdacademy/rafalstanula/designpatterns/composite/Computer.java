package pl.sdacademy.rafalstanula.designpatterns.composite;

public class Computer {
    private Processor processor;
    private HardDrive hardDrive;
    private Monitor monitor;

    public Computer(Processor processor, HardDrive hardDrive, Monitor monitor) {
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.monitor = monitor;
    }

    public void tick() {
        processor.compute();
        hardDrive.saveData();
        monitor.display();
    }
}
