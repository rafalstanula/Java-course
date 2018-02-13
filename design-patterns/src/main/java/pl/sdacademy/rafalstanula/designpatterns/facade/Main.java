package pl.sdacademy.rafalstanula.designpatterns.facade;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CarFacade carFacade = new CarFacade(car);

        carFacade.startCar();
    }
}
