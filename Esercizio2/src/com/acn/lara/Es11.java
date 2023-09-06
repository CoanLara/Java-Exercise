package com.acn.lara;

import java.util.HashMap;
import java.util.Set;

public class Es11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Scrivere un programma Java per ottenere una vista impostata 
	 delle chiavi contenute in questa mappa */
		
		HashMap <String, Integer> mappa = new HashMap <>();
		
		mappa.put("rana", 6);
		mappa.put("topolino", 5);
		
		
		Set<String> vistaChiave = mappa.keySet();
		
		for(String chiave : vistaChiave) {
			System.out.println("Chiave: " + chiave);
		}
	}

}
