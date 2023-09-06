package com.acn.lara;

import java.util.HashSet;

public class Es7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scrivere un programma Java per convertire un HashSet in un array
		
		HashSet <String> set = new HashSet <>();
		
		set.add("Lara");
		set.add("Emily");
		set.add("Asya");
		set.add("Chiara");
		
		//creo un array con la stessa dimensione dell'hashset
		
		String [] array = new String[set.size()];
		
		//copio gli elementi dall'hashset all'array
		
		set.toArray(array);
		
		System.out.println("Array ottenuto con la conversione:");
		
		for(String lista : array) {
			System.out.println(lista);
		}
		
	}

}
