package com.acn.lara;

import java.util.HashMap;

public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 /*Scrivere un programma Java per associare il valore specificato alla chiave 
  specificata in una HashMap */
		
		
		HashMap<String, Integer> mappa = new HashMap <>();
		
		mappa.put("Giorgio", 4);
		mappa.put("Marco", 2);
		mappa.put("Luca", 1);
		mappa.put("Alice", 3);
		
		System.out.println(mappa);
		
		//aggiungo un nuovo valore 
		
		String nuovaChiave = "Mara";
		int nuovoValore = 5;
		mappa.put(nuovaChiave, nuovoValore);
		
		System.out.println("Mappa aggiornata " + mappa);
		
	}

}
