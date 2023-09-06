package com.scn.lara;

import java.util.TreeSet;

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scrivere un programma Java per scorrere tutti gli elementi in un insieme di Tree Set
		
		
        TreeSet <String> set = new TreeSet <>();
		
		set.add("Bianco");
		set.add("Rosso");
		set.add("Nero");
		set.add("Verde");
		
		System.out.println("Colori: ");
		for(String colori : set) {
			System.out.println(colori);
		}	
	}

}
