package com.acn.lara;

import java.util.HashMap;

public class Es14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Scrivere un programma Java per ottenere la porzione di questa 
	 mappa le cui chiavi sono inferiori (o uguali, se inclusivo 
	 è vero) a una determinata chiave. */	
		
		HashMap <Integer, Integer> map = new HashMap <>();
		
		map.put(12, 24);
		map.put(1, 10);
		map.put(78, 2);
		map.put(8, 16);
		
		Integer valoreChiave = 55;
		
		for(Integer valore : map.keySet()) {
			if(valore <= valoreChiave) {
				System.out.println(valore);
			}
		}
		
	}

}
