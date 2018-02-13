package com.stanula;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Weryfikator wer = new Weryfikator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer dowodu osobistego");
        String nrDowodu = sc.nextLine();
        System.out.println(wer.sprawdzPoprawnosc(nrDowodu));
    }
}
