package com.scn.lara;

import java.util.TreeSet;

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Scrivere un programma Java per clonare un elenco di insiemi di Tree Set 
 * in un altro insieme di Tree Set	
 */
		
		
        TreeSet <String> set = new TreeSet <>();
		
		set.add("Bianco");
		set.add("Rosso");
		set.add("Nero");
		set.add("Verde");
		
		
		TreeSet <String> set2 = new TreeSet <>(set);
		
		System.out.println(set2);
	}

}
