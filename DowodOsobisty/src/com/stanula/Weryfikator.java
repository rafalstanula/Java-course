package com.stanula;

import java.util.ArrayList;
import java.util.List;

public class Weryfikator {

    public boolean wynik;
    public char charTest[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public int mnozniki[] = {7, 3, 1, 9, 7, 3, 1, 7, 3};
    List<Integer> lista = new ArrayList<>();
    int suma = 0;

    public boolean sprawdzPoprawnosc(String nr) {
        char[] charNr = nr.toCharArray();
        if (nr.length() != 9) {
            wynik = false;
        } else {
            for (int i = 0; i < charNr.length; i++) {
                for (int j = 0; j < charTest.length; j++) {
                    if (charNr[i] == charTest[j]) {
                        lista.add(j);
                    }
                }
            }
            for (int i = 0; i < lista.size(); i++) {
                suma = suma + lista.get(i) * mnozniki[i];
            }
            if (suma % 10 == 0) {
                wynik = true;
            } else {
                wynik = false;
            }
        }
        return wynik;
    }
}