package com.scn.lara;

import java.util.TreeSet;

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Scrivere un programma Java per aggiungere tutti gli elementi di un insieme di 
		//Tree Set specificato a un altro insieme di Tree Set.	

		TreeSet <String> set = new TreeSet <>();
		
		set.add("Bianco");
		set.add("Rosso");
		set.add("Nero");
		set.add("Verde");
		
		
		TreeSet <String> set2 = new TreeSet <>();
		
		set2.add("Arancione");
		set2.add("Blu");
		set2.add("Viola");
		set2.add("Giallo");
		
		set.addAll(set2);
		System.out.println(set);
		
		
		
	}

}
