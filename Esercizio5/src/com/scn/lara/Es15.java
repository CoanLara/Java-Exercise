package com.scn.lara;

import java.util.TreeSet;

public class Es15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*Scrivere un programma Java per recuperare e rimuovere l'ultimo elemento 
 * di un insieme di Tree Set.
 */
		
		
		TreeSet <Integer> set= new TreeSet<>();

		set.add(34);
		set.add(23);
		set.add(20);
		set.add(80);
		
		System.out.println(set);
		
		System.out.println("Set senza l'ultimo elemento: ");
		
		set.pollLast();
		
		System.out.println(set);
		
	}

}
