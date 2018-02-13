package com.stanula;

import java.util.Calendar;

public class Pole extends Person{

    private String pesel;

    public Pole(String firstName, String lastName, String pesel) {
        super(firstName, lastName, getAgeFromPesel(pesel));
        this.pesel = pesel;
    }

    private static int getAgeFromPesel(String pesel) {
        int biezacyRok = Calendar.getInstance().get(Calendar.YEAR);
        int rokUrdzenia = Integer.parseInt(pesel.substring(0, 2));
        return -1900 + biezacyRok-rokUrdzenia;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " PL, wiek: " + this.getAge();
    }
}
