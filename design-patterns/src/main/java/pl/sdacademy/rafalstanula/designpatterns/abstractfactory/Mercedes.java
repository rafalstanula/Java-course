package pl.sdacademy.rafalstanula.designpatterns.abstractfactory;

public class Mercedes extends Car {

    public Mercedes(String nr) {
        super(nr);
    }

    @Override
    public void drive() {
        System.out.println("Driving in Mercedes, " + nr);
    }
}
