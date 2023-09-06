package com.acn.lara;

import java.util.HashMap;

public class Es7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Scrivere un programma Java per verificare se una mappa contiene 
	 una mappatura per la chiave specificata */
		
	HashMap <String, Integer> mappa = new HashMap <>();
	
	mappa.put("Gianni", 22);
	mappa.put("Elisa", 3);
	mappa.put("Rita", 78);
	
	String chiaveDaVerificare = "Elisa";
	
	//verifico che la mappatura contine la mappatura associata alla chiave
	
	boolean chiaveContenuta = mappa.containsKey(chiaveDaVerificare);
	
	if(chiaveContenuta) {
		System.out.println("La mappa contiene una mappatura per la chiave specificata: " + chiaveDaVerificare );
	}else
		System.out.println("La mappa non contiene la mappatura per la chiave specificata: " + chiaveDaVerificare);
		
	
	
	
	
	
	}

}
