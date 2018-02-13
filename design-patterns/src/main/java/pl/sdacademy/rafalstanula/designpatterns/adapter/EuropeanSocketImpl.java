package pl.sdacademy.rafalstanula.designpatterns.adapter;

public class EuropeanSocketImpl implements EuropeanSocket {
    public void power230V() {
        System.out.println("230V");
    }
}
