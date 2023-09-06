package com.scn.lara;

import java.util.Iterator;
import java.util.TreeSet;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Scrivere un programma Java per creare una vista in ordine inverso degli 
	 * elementi contenuti in un dato insieme di Tree Set */	
		
		 TreeSet <Integer> set = new TreeSet <>();
			
			set.add(1);
			set.add(30);
			set.add(14);
			set.add(27);
		
			
			Iterator it = set.descendingIterator();
			while (it.hasNext()) 
				System.out.println(it.next());
			
			
	}

}
