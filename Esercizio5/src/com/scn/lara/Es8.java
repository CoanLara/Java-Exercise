package com.scn.lara;

import java.util.TreeSet;

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scrivere un programma Java per confrontare due insiemi di Tree Set.
		
		TreeSet <Integer> set = new TreeSet<>();
		
		TreeSet <Integer> set2 = new TreeSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		set2.add(4);
		set2.add(8);
		
		
		boolean equals= set.equals(set2);

		if(equals)
			System.out.println("Sono uguali");
		else
			System.out.println("Sono diversi");
	}

}
