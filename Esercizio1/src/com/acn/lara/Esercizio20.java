package com.acn.lara;

import java.util.ArrayList;

public class Esercizio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scrivere un programma Java per aumentare la dimensione di un elenco di array
		
		ArrayList<Integer> elenco = new ArrayList<>();
		
		//aggiungo degli elementi all'ArrayList
		
		for(int i = 1; i <= 5; i++) {
			elenco.add(i);
		}
		
		System.out.println("Dimensione arrayList: " + elenco.size());
		
		//aggiungo altri elementi e aumento la dimensione dell'Array
		
		for (int i = 6; i <= 10; i++) {
			elenco.add(i);
		}
		
		//stampo la dimensione dell'Array aggiornata
		
		System.out.println("Dimensione aggiornata: " + elenco.size());
	}

}
