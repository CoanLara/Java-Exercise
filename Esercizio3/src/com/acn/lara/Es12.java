package com.acn.lara;

import java.util.HashSet;

public class Es12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scrivere un programma Java per rimuovere tutti gli elementi da HashSet
		
		HashSet <Integer> set = new HashSet<>();
		
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		
		System.out.println("HashSet: " + set);
		
		set.clear();
		
		System.out.println("HashSet vuoto: " + set);
	}

}
