package com.stanula;

public class CPrzystanek {

    protected String nazwa;
    protected String nastepny;
    protected int metrowDo = 0;
    protected int minDo = 0;

    public CPrzystanek(String nazwa, String następny, int metrowDo, int minDo) {
        this.nazwa = nazwa;
        this.nastepny = następny;
        this.metrowDo = metrowDo;
        this.minDo = minDo;
    }

    public CPrzystanek(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "\nPrzystanek: " + nazwa + "\n  następny: " + ((nastepny==null)?"-brak-":nastepny+ ", metrów do: " +metrowDo+ ", minut do: " +minDo) ;
    }
}

