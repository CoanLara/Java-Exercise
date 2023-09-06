package com.scn.lara;

import java.util.TreeSet;

public class Es16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scrivere un programma Java per rimuovere un dato elemento da un insieme di Tree Set.
		
		
		TreeSet <Integer> set= new TreeSet<>();

		set.add(34);
		set.add(23);
		set.add(20);
		set.add(80);
		
		System.out.println(set);
		
		System.out.println("Set senza il secondo elemento: ");
		
		set.remove(23);
		
		System.out.println(set);
	}

}
