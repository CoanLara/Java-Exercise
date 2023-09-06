package com.acn.lara;

import java.util.TreeMap;

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per copiare il contenuto di una 
	 * Tree Map in un'altra Tree Map. */	
		
		TreeMap <Integer, Integer> map = new TreeMap<>();
		
		map.put(1, 2);
		map.put(2, 4);
		map.put(3, 10);
		
		TreeMap <Integer, Integer> map2 = new TreeMap<>(map);
		
		System.out.println("TreeMap copia: " + map2);
		
	}

}
