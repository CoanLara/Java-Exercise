package com.acn.lara;

import java.util.TreeMap;

public class Es25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere una mappatura chiave-valore associata 
	 * alla chiave minima maggiore o uguale alla chiave data. Restituisce null se non
	 *  esiste tale chiave */	
		
		TreeMap <Integer, Integer> map = new TreeMap <>();
		
		map.put(20, 1);
		map.put(12, 2);
		map.put(14, 3);
		map.put(50, 4);
		
		Integer chiave = 14;
		
		System.out.println(map.higherEntry(chiave));
		
	}

}
