package com.acn.lara;

import java.util.TreeMap;

public class Es21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere la porzione di una mappa le cui chiavi 
	 * vanno da una determinata chiave (inclusiva) a un'altra chiave (esclusiva)*/	
		
        TreeMap <String, Integer> map = new TreeMap <>();
		
		map.put("Lara", 1);
		map.put("Emily", 2);
		map.put("Mara", 3);
		
		String chiaveInizio = "Lara"; 
        String chiaveFine = "Mara";
		
		System.out.println(map.subMap(chiaveInizio, true, chiaveFine, false));
		
	}

}
