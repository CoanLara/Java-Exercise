package com.scn.lara;

import java.util.TreeSet;

public class Es10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scrivere un programma Java per ottenere l'elemento in un insieme di Tree Set 
		 * che è maggiore o uguale all'elemento dato.
		 * 
		 */
		
		TreeSet <Integer> set= new TreeSet<>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(6);
		set.add(7);
		set.add(10);
		

		
		System.out.println(set.ceiling(5));
		
		
	}

}
