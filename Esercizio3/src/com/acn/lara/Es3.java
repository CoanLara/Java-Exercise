package com.acn.lara;

import java.util.HashSet;

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere il numero 
	 di elementi in un HashSet */	
		
		HashSet <Integer> set = new HashSet<>();
		
		set.add(67);
		set.add(9);
		set.add(32);
		set.add(2);
		
		//int totElementi = set.size();
		
		System.out.println("Tot elementi nell'HashSet: " + set.size());
		
	}

}
