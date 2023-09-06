package com.acn.lara;

import java.util.HashSet;

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scrivere un programma Java per verificare che un HashSet sia vuoto o meno
		
		HashSet <Integer> set = new HashSet<>();
		
		set.add(34);
		set.add(12);
		set.add(67);
		set.add(54);
		
		
		boolean isEmpty = set.isEmpty();
		
		//primo metodo
		
		System.out.println(isEmpty);
		
		//secondo metodo
		
		if(isEmpty) {
			System.out.println("Il set è vuoto: " + set);
		}else
			System.out.println("Il set è pieno: " + set);
	}

}
