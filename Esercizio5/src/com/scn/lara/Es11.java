package com.scn.lara;

import java.util.TreeSet;

public class Es11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Scrivere un programma Java per ottenere l'elemento in un insieme di Tree Set
		 *  che è minore o uguale all'elemento dato
		 */
		
		TreeSet <Integer> set= new TreeSet<>();

		set.add(1);
		set.add(4);
		set.add(25);
		set.add(6);
		set.add(18);
		set.add(52);
		

		
		System.out.println(set.ceiling(33));
	}

}
