package com.acn.lara;

import java.util.HashMap;

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Scrivere un programma Java per verificare se una mappa contiene una mappatura 
	 per il valore specificato */	
		
		HashMap <String, Integer> mappa = new HashMap <>();
		
		mappa.put("blu", 12);
		mappa.put("ciano", 6);
		mappa.put("rosso", 3);
		
		int valoreDaVerificare = 12;
		
		//verifico
		
		boolean valoreContenuto = mappa.containsValue(valoreDaVerificare);
		
		if(valoreContenuto) {
			System.out.println("Il valore specificato è contenuto: " + valoreDaVerificare);
		}else 
			System.out.println("Il valore specificato non è contento: " + valoreDaVerificare);
	}

}
