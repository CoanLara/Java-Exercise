package com.acn.lara;

import java.util.HashMap;

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per contare il numero di mappature di valori-chiave 
	 (dimensioni) in una mappa*/	
		
		HashMap <String, Integer> mappa = new HashMap<>();
		
		mappa.put("Giovanni", 1);
		mappa.put("Mirko", 7);
		mappa.put("Alessia", 3);
		
		//calcolo la grandezza di HashMap
		
		
	    System.out.println("Grandezza HashMap: ");
		System.out.println(mappa.size());
		
	}

}
