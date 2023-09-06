package com.acn.lara;

import java.util.HashMap;

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Scrivere un programma Java per copiare tutte le mappature dalla mappa 
	 specificata a un'altra mappa*/
		
		HashMap <String, Integer> mappa = new HashMap<>();
		
		mappa.put("Alice", 4);
		mappa.put("Wendy", 2);
		mappa.put("Mario", 10);
		
		System.out.println("Mappa 1: " + mappa);
		
		//creo una nuova mappa e copio gli elementi della prima
		
		HashMap <String, Integer> mappa2 = new HashMap<>();
		
		mappa2.putAll(mappa);
		
		//stampo la mappa2 opzione 1
		
		System.out.println("Mappa 2: ");
		
		mappa2.forEach((chiave, valore) -> System.out.println(chiave + ":" + valore));
		
		//stampo la mappa2 opzione 2
		
		System.out.println("Mappa 2 : " + mappa2);
		
	}

}
