package com.acn.lara;

import java.util.HashMap;

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per verificare se una mappa contiene 
	 mappature di valori-chiave (vuote) o meno */
		
		HashMap <String, Integer> mappa = new HashMap <>();
		
		//verifico se la mappa è vuota
		
		boolean isEmpty = mappa.isEmpty();
		
		System.out.println(mappa);
		
		//aggiungo valori alla mappa vuota
		
		mappa.put("Rosso", 40);
		mappa.put("Giallo", 39);
		mappa.put("Verde", 32);
		
		System.out.println(mappa);
	}

}
