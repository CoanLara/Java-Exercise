package com.scn.lara;

import java.util.TreeSet;

public class Es12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere l'elemento in un insieme di Tree Set 
	 * che è strettamente maggiore o uguale all'elemento dato	
	 */
		
		TreeSet <Integer> set= new TreeSet<>();

		set.add(34);
		set.add(23);
		set.add(80);
		
	
		System.out.println(set.higher(7));
	}

}
