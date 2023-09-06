package com.acn.lara;

import java.util.HashMap;

public class Es10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere il valore di una chiave specificata
	  in una mappa */	
		
		HashMap <String, Integer> mappa = new HashMap <>();
		
		mappa.put("formica", 2);
		mappa.put("cane", 4);
		mappa.put("giraffa", 8);
		
		String chiaveSpecifica = "cane";
		
		Integer valoreDaOttenere = mappa.get(chiaveSpecifica);
		
		System.out.println(valoreDaOttenere);
		 
		
		
	}

}
