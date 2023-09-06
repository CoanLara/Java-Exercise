package com.acn.lara;


import java.util.TreeMap;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Scrivere un programma Java per cercare un valore in una Tree Map.
		
		TreeMap <Integer, Integer> map = new TreeMap <>();
		
		map.put(56, 13);
		map.put(2, 80);
		map.put(23, 78);
		
		if(map.containsValue(13)) {
			System.out.println("La mappa contine il valore");
		}else 
			System.out.println("La mappa non contiene il valore");
	}

}
