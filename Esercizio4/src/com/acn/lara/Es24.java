package com.acn.lara;

import java.util.TreeMap;

public class Es24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere una porzione di una mappa le cui chiavi 
	 * sono maggiori di una determinata chiave */	
		
		 TreeMap <Integer, Integer> map = new TreeMap <>();
			
			map.put(20, 1);
			map.put(12, 2);
			map.put(14, 3);
			map.put(50, 4);
			
			Integer chiave = 20;
			
			System.out.println(map.tailMap(chiave, false));
	}

}
