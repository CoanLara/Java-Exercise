package com.acn.lara;

import java.util.HashSet;

public class Es10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scrivere un programma Java per confrontare due HashSet.
		
		HashSet <Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		HashSet <Integer> set2 = new HashSet<>();
		
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		set.equals(set2);
		
		if (set == set2) {
			System.out.println("I due set sono uguali");
		}else 
			System.out.println("I due set sono diversi");
		
		
	}

}
