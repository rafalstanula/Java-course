package pl.sdacademy.rafalstanula.designpatterns.facade;

public class Car {
    public void openDoor() {
        System.out.println("door opened");
    }

    public void closeDoor() {
        System.out.println("door closed");
    }

    public void seatBelts() {
        System.out.println("seat belts");
    }

    public void clutch() {
        System.out.println("clutch pressed");
    }

    public void startEngine() {
        System.out.println("engine started");
    }
}
