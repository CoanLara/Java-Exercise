package com.acn.lara;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Es19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 /* Scrivere un programma Java per rimuovere e ottenere una mappatura di valori-chiave
  *  associata alla chiave minima in una mappa. */
		
		TreeMap <String, Integer> map = new TreeMap <>();
		
		map.put("Lara", 1);
		map.put("Emily", 2);
		map.put("Mara", 3);
		
		NavigableSet <String> navigableSet = map.navigableKeySet();

	    System.out.println("Chiave minima: ");
	    System.out.println(navigableSet.pollFirst());

	    System.out.println("TreeMap dopo la rimozione:");
	    System.out.println(map);
		
		
		
	}

}
