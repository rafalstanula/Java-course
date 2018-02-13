package pl.sdacademy.rafalstanula.designpatterns.adapter;

public class EuropeanToUSASocketAdapter implements USASocket {
    private EuropeanSocket europeanSocket;

    public EuropeanToUSASocketAdapter(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    @Override
    public void power110V() {
        europeanSocket.power230V();
        System.out.println("converted to 110V");
    }
}
