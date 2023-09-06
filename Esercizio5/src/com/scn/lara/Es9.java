package com.scn.lara;

import java.util.TreeSet;

public class Es9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Scrivere un programma Java per trovare i numeri inferiori a 7 in un insieme di Tree Set.
		
        TreeSet <Integer> set = new TreeSet<>();
		
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(8);
		
		for(int numero: set) {
			if(numero<7)
				System.out.println(numero);
		}
	}

}
