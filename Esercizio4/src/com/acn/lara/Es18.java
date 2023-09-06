package com.acn.lara;

import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Es18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scrivere un programma Java per ottenere la vista NavigableSet 
		 * delle chiavi contenute in una mappa. */
		
		TreeMap <String, Integer> map = new TreeMap <>();
		
		String chiave1 = "Lara";
		String chiave2 = "Emily";
		String chiave3 = "Mara";
		
		Integer valore1 = 1;
		Integer valore2 = 2;
		Integer valore3 = 3;
		
		map.put(chiave1, valore1);
		map.put(chiave2, valore2);
		map.put(chiave3, valore3);
		
		
		NavigableSet <String> mappe = map.navigableKeySet();
		
		System.out.println(mappe);
		
	}

}
