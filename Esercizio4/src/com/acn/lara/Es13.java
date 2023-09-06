package com.acn.lara;

import java.util.HashMap;
import java.util.TreeMap;

public class Es13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere la porzione di una
      mappa le cui chiavi sono rigorosamente inferiori a una 
      determinata chiave */	
		
		HashMap <Integer, Integer> map = new HashMap <>();
		
		map.put(10, 20);
		map.put(20, 30);
		map.put(40, 50);
		map.put(100, 200);
		
		Integer valoreChiave = 40;
		
		System.out.println("Chiavi inferiori ad una chiave data: " );
		for(Integer valore : map.keySet()) {
			if(valore < valoreChiave) {
				System.out.println(valore);
			}
				
			
		}
		
		
		
	}

}
