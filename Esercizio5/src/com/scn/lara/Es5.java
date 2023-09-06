package com.scn.lara;

import java.util.TreeSet;

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere il primo e l'ultimo elemento 
	 * di un insieme di Tree Set.	
	 */
		
        TreeSet <String> set = new TreeSet <>();
		
		set.add("Arancione");
		set.add("Blu");
		set.add("Viola");
		set.add("Giallo");
		
		System.out.println("Primo elemento: " + set.first());
		
		System.out.println("Ultimo elemento: " + set.last());
		
		
	
	}

}
