package com.acn.lara;

import java.util.HashSet;

public class Es11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivi un programma Java per confrontare due insiemi e 
	conservare gli elementi che sono uguali su entrambi gli insiemi*/
		
		HashSet <Integer> set = new HashSet<>();
		
		HashSet <Integer> set2 = new HashSet <>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		set2.add(10);
		set2.add(3);
		set2.add(1);
		set2.add(7);
		
		set.retainAll(set2);
		
		System.out.println("Elementi uguali presenti in set e set2: " + set);
	}

}
