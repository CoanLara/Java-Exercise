package com.acn.lara;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Es20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/* Scrivere un programma Java per rimuovere e ottenere una mappatura chiave-valore 
	 * associata alla chiave più grande in questa mappa*/
		
        TreeMap <String, Integer> map = new TreeMap <>();
		
		map.put("Lara", 1);
		map.put("Emily", 2);
		map.put("Mara", 3);
		
		NavigableSet <String> navigableSet = map.navigableKeySet();
		
		System.out.println("Chiave più grande: ");
		System.out.println(navigableSet.pollLast());
		
		 System.out.println("TreeMap dopo la rimozione:");
		 System.out.println(map);
	}

}
