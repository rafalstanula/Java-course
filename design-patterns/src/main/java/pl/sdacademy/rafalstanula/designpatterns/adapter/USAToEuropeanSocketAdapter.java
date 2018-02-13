package pl.sdacademy.rafalstanula.designpatterns.adapter;

public class USAToEuropeanSocketAdapter implements EuropeanSocket {

    USASocket usaSocket;

    public USAToEuropeanSocketAdapter(USASocket usaSocket) {
        this.usaSocket = usaSocket;
    }

    @Override
    public void power230V() {
        usaSocket.power110V();
        System.out.println("converted to 230V");
    }
}

