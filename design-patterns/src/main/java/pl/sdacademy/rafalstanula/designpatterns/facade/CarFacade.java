package pl.sdacademy.rafalstanula.designpatterns.facade;

public class CarFacade {
    private Car car;

    public CarFacade(Car car) {
        this.car = car;
    }

    public void startCar() {
        car.openDoor();
        car.closeDoor();
        car.seatBelts();
        car.clutch();
        car.startEngine();
    }
}
