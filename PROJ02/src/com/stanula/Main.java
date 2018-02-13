package com.stanula;

public class Main {

    public static void main(String[] args) {
	CPojazd P1 = new CPojazd(4);
	CPojazd P2 = new CPojazd(129);

	P1.dodajPrzystanek("Dworzec", "LOT", 300, 3, "Bieżanów", "Prokocim", "Prokocim Szpital", "Kurdwanów");
	P1.dodajPrzystanek("LOT", "Bagatela", 500, 5, "Azory", "Szpitalna", "Lekarska");
	P1.dodajPrzystanek("Filharmonia", "Plac Wszyskich Sw", 550, 2);
	P1.dodajPrzystanek("Grothgera");

		System.out.println(P1.toString());

    }
}
