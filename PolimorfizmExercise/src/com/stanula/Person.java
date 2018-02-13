package com.stanula;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return firstName + " " + lastName + ", wiek: " + age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
