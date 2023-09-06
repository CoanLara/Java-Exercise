package com.acn.lara;

import java.util.HashSet;
import java.util.TreeSet;

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scrivere un programma Java per convertire un HashSet in un Tree Set
		
		HashSet <String> set = new HashSet<>();
		
		set.add("Lara");
		set.add("Emily");
		
		TreeSet <String> tree = new TreeSet<>(set);
		
		System.out.println(tree);
	}

}
