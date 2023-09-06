package com.acn.lara;

import java.util.TreeMap;

public class ERs22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere la porzione di una mappa le cui chiavi
	 *  vanno da una determinata chiave a un'altra chiave */	
		
		
		 TreeMap <Integer, Integer> map = new TreeMap <>();
			
			map.put(20, 1);
			map.put(12, 2);
			map.put(14, 3);
			map.put(50, 4);
			
			Integer chiaveInizio = 12; 
	        Integer chiaveFine = 50;
			
			System.out.println(map.subMap(chiaveInizio, false, chiaveFine, false));
			
	}

}
