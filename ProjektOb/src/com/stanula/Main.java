package com.stanula;

public class Main {

    public static void main(String[] args) {
        CKsztaltownik K50x50 = new CKsztaltownik( 50, 50, 5, 7, 3.5);
        CKsztaltownik K120x120 = new CKsztaltownik( 120, 120, 12, 13, 6.5);
        CKsztaltownik K90x60 = new CKsztaltownik( 90, 60, 8, 9, 4);

        K50x50.pole();
        K120x120.pole();
        K90x60.pole();

        System.out.println(K50x50.dajWynik(5));
        System.out.println(K120x120.dajWynik(2));
        System.out.println(K90x60.dajWynik(3));
    }
}

