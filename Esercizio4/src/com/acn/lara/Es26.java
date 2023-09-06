package com.acn.lara;

import java.util.TreeMap;

public class Es26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere la chiave minima maggiore o uguale alla chiave
	 *  data. Restituisce null se non esiste tale chiave */	
		
        TreeMap <Integer, Integer> map = new TreeMap <>();
		
		map.put(20, 1);
		map.put(12, 2);
		map.put(14, 3);
		map.put(50, 4);
		
		Integer chiave = 12;
		
		System.out.println(map.ceilingKey(chiave));
		
	}

}
