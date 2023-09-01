package com.acn.lara;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Esercizio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scrivere un programma Java per ordinare un dato elenco di array.
		
		ArrayList<Integer> elenco = new ArrayList<>();
		
		elenco.add(8);
		elenco.add(2);
		elenco.add(10);
		elenco.add(1);
		elenco.add(3);
		
		//ordino la lista in modo crescente
		
		Collections.sort(elenco);
		
		System.out.println("Array ordinato in modo crescente");
		for (int elementi : elenco) {
			System.out.println(elementi);
		}
		
		
	}

}
