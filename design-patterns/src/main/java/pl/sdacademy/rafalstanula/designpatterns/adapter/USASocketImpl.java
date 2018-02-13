package pl.sdacademy.rafalstanula.designpatterns.adapter;

public class USASocketImpl implements USASocket {
    public void power110V() {
        System.out.println("110V");
    }
}
