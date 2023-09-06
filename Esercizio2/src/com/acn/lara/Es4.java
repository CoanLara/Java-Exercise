package com.acn.lara;

import java.util.HashMap;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per rimuovere tutte le mappature da una mappa*/
		
		HashMap <String, Integer> mappa = new HashMap<>();
		
		mappa.put("Ciao", 1);
		mappa.put("Come", 2);
		mappa.put("Stai", 3);
		
		System.out.println(mappa);
		
		//elimino gli elementi dalla mappa
		
		mappa.clear();
		
		System.out.println(mappa);
	}

}
