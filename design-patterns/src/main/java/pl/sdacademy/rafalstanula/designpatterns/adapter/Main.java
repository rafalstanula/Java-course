package pl.sdacademy.rafalstanula.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
//        EuropeanSocket europeanSocket = new EuropeanSocketImpl();
//        USASocket usaSocket = new EuropeanToUSASocketAdapter(europeanSocket);
//
//        europeanSocket.power230V();
//        usaSocket.power110V();

        USASocket usaSocket = new USASocketImpl();
        EuropeanSocket europeanSocket = new USAToEuropeanSocketAdapter(usaSocket);

        europeanSocket.power230V();
        usaSocket.power110V();
    }
}
