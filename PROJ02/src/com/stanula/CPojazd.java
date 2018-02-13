package com.stanula;

import java.util.ArrayList;
import java.util.List;

public class CPojazd {
    protected static String przedsiebiorstwo = "MPK Kraków";
    protected int numer;
    protected List<CPrzystanek> trasa;

    public CPojazd(int numer) {
        this.numer = numer;
        trasa = new ArrayList<>();
    }

    public void dodajPrzystanek(String nazwa, String następny, int metrowDo, int minDo) {
        CPrzystanek cPrzystanek = new CPrzystanek(nazwa, następny, metrowDo, minDo);
        trasa.add(cPrzystanek);
    }

    public void dodajPrzystanek(String nazwa) {
        CPrzystanek cPrzystanek = new CPrzystanek(nazwa);
        trasa.add(cPrzystanek);
    }

    public void dodajPrzystanek(String nazwa, String następny, int metrowDo, int minDo, String...args) {
        CPrzystanekPrzes cPrzystanekPrzes = new CPrzystanekPrzes(nazwa, następny, metrowDo, minDo, args);
        trasa.add(cPrzystanekPrzes);
    }

    public void dodajPrzystanek(String nazwa, String... args) {
        CPrzystanekPrzes cPrzystanekPrzes = new CPrzystanekPrzes(nazwa, args);
        trasa.add(cPrzystanekPrzes);
    }

    @Override
    public String toString() {
        String drukTrasa = "Numer = " + numer + ", właścicel: " + przedsiebiorstwo + ", trasa: \n";
        for (CPrzystanek cPrzystanek : trasa) {
            drukTrasa += cPrzystanek;
        }
        return drukTrasa;
    }
}