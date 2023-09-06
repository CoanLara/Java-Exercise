package com.acn.lara;

import java.util.HashSet;

public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Scrivere un programma Java per aggiungere l'elemento 
	 specificato alla fine di un HashSet*/
		
		HashSet <String> set = new HashSet<>();
		
		set.add("Lara");
		set.add("Emily");
		set.add("Mara");
		
		System.out.println("Set base: " + set);
		
		String nuovoElemento = "Gaia";
		
		set.add(nuovoElemento);
		
		System.out.println("Set con aggiunta nuovo elemento: ");
		System.out.println(set);
		
		
		
	}

}
