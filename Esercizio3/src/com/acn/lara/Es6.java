package com.acn.lara;

import java.util.HashSet;

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Scrivere un programma Java per clonare un HashSet su un altro HashSet
		
		HashSet <Integer> set = new HashSet<>();
		
		set.add(8);
		set.add(9);
		set.add(10);
		set.add(5);
		
		System.out.println("HashSet: " + set);
		
		HashSet <Integer> setClone = new HashSet<>(set);
		
		System.out.println("HashSet clonato: " + setClone);
		
	}

}
