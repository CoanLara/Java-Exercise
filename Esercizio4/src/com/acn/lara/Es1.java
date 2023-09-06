package com.acn.lara;

import java.util.TreeMap;

public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Scrivere un programma Java per associare il valore specificato
 *  alla chiave specificata in una Tree Map */
		
		
		TreeMap <Integer, Integer> map = new TreeMap<>();
		
		map.put(12, 24);
		map.put(7, 14);
		map.put(8, 16);
		
		System.out.println(map);
		
		Integer chiave = 9;
		Integer valore = 18;
		
		map.put(chiave, valore);
		
		System.out.println("Mappa dopo inserimento ultimi valori: " + map);
	}

}
