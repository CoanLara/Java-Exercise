package com.acn.lara;

import java.util.ArrayList;

public class Esercizio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scrivere un programma Java per ridurre la capacità di un elenco di array
	//in base alla dimensione dell'elenco corrente.

		
		ArrayList<String> Lista = new ArrayList<>(8);
		
		Lista.add("Elemento 1");
		Lista.add("Elemento 2");
		Lista.add("Elemento 3");
		Lista.add("Elemento 4");
		Lista.add("Elemento 5");
		
		//Stampo la grandezza iniziale dell'arrayList
		
		System.out.println("ArrayList iniziale: " + Lista.size());
		
		//Riduco la dimensione dell'ArraList
		
		Lista.trimToSize();
		
		System.out.println("ArrayList con grandezza aggiornata: " + Lista.size());
	}

}
