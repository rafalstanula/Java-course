package com.stanula;

public class CPrzystanekPrzes extends CPrzystanek {

    protected String[] przesiadki;

    private void przypiszPrzesiadki(String...args) {
        if (args.length > 0) {
            przesiadki = new String[args.length];
            int i = 0;
            for (String args2 : args) {
                przesiadki[i++] = args2;
            }
        } else {
            System.out.println("null");
        }
    }

    public CPrzystanekPrzes() {
        super("-", null, 0, 0);
        this.przesiadki = null;
    }

    public CPrzystanekPrzes(String nazwa, String następny, int metrowDo, int minDo, String... args) {
        super(nazwa, następny, metrowDo, minDo);
        przypiszPrzesiadki(args);
    }

    public CPrzystanekPrzes(String nazwa, String... args) {
        super(nazwa);
        przypiszPrzesiadki(args);
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "\n  przesiadki: ";
        if (przesiadki == null) res += "brak";
        else
            for (String pp : przesiadki)
                res += pp + ", ";
        return res;
    }
}
