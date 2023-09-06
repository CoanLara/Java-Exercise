package com.acn.lara;

import java.util.TreeMap;

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per cercare una chiave 
	 * in una Tree Map */
		
		
		TreeMap <Integer, Integer> map = new TreeMap <>();
		
		map.put(10, 20);
		map.put(20, 30);
		map.put(50, 60);
		map.put(30, 40);
		
		if(map.containsKey(50)) {
			System.out.println("La mappa contiene la chiave");
		}else
			System.out.println("La mappa npon contiene la chiave");
		
		
		
	}

}
