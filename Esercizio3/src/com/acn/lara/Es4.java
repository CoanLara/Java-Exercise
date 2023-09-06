package com.acn.lara;

import java.util.HashSet;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scrivere un programma Java per svuotare un HashSet
		
		HashSet <String> set = new HashSet<>();
		
		set.add("Lara");
		set.add("Emily");
		set.add("Mara");
		set.add("Gaia");
		
		System.out.println("HashSet con elementi: " + set);
		
		set.clear();
		
		System.out.println("HashSet vuoto: " + set);
	}

}
