package com.acn.lara;

import java.util.Collections;
import java.util.TreeMap;

public class Es7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//  Scrivere un programma Java per ordinare le chiavi nella
		//Tree Map utilizzando il comparatore.	
		
        TreeMap <Integer, Integer> map = new TreeMap <>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		
		System.out.println(map.comparator());
		
	}

}
