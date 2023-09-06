package com.scn.lara;

import java.util.TreeSet;

public class Es13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Scrivere un programma Java per ottenere in un insieme di Tree Set un elemento
	 *  che sia strettamente inferiore all'elemento dato.	
	 */
		
		
		TreeSet <Integer> set= new TreeSet<>();

		set.add(1);	
		set.add(25);
		set.add(6);
		set.add(18);
		
		

		System.out.println(set.lower(11));
	}

}
