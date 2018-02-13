package com.stanula;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile osób chcesz wprowadzić");
        int numbersOfPersons = sc.nextInt();
        sc.nextLine();
        Person[] persons = new Person[numbersOfPersons];
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Podaj imie");
            String firstName = sc.nextLine();
            System.out.println("Podaj nazwisko");
            String lastName = sc.nextLine();
            System.out.println("Podaj kraj pochodzenia");
            String country = sc.nextLine();

            if (country.equals("PL")) {
                System.out.println("Podaj PESEL");
                String pesel = sc.nextLine();
                persons[i] = new Pole(firstName, lastName, pesel);
            }
            else if(country.equals("UK") || country.equals("DE")){
                System.out.println("Podaj wiek");
                int age = sc.nextInt();
                sc.nextLine();
                persons[i] = new EUCitzen(firstName, lastName, age, country);
            }
            else {
                System.out.println("Podaj wiek");
                int age = sc.nextInt();
                sc.nextLine();
                persons[i] = new RestOfWorld(firstName, lastName, age, country);
            }
        }
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].getAge() > persons[j].getAge()) {
                    Person p = persons[j];
                    persons[j] = persons[i];
                    persons[i] = p;
                }
            }
        }

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Pole)
                System.out.println(persons[i]);

        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof EUCitzen) {
                System.out.println(persons[i]);
            }
        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof RestOfWorld) {
                System.out.println(persons[i]);
            }
        }
    }
}
