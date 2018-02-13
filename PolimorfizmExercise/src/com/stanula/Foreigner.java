package com.stanula;

public class Foreigner extends Person {

    private String country;

    public Foreigner(String firstName, String lastName, int age, String country) {
        super(firstName, lastName, age);
        this.country = country;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this. country + ", wiek: " + this.getAge();
    }

    public String getCountry() {
        return country;
    }
}

