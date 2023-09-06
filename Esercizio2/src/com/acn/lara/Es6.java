package com.acn.lara;

import java.util.HashMap;

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Scrivi un programma Java per ottenere una copia superficiale di un'istanza HashMap. */
		
		HashMap <String, Integer> mappa = new HashMap<>();
		
		mappa.put("Giulia", 4);
		mappa.put("Rana", 5);
		
		System.out.println("Mappa 1: " + mappa);
		
		//creo una copia superficiale
		
		HashMap <String, Integer> mappa2 = new HashMap<>(mappa);
		
		mappa2.put("Titti", 7);
		
		System.out.println("Mappa 2: " + mappa2);
		
	}

}
