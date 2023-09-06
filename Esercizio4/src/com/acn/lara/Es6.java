package com.acn.lara;

import java.util.TreeMap;

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Scrivere un programma Java per eliminare tutti gli
		//elementi da una determinata Tree Map.
		
		TreeMap <Integer, Integer> map = new TreeMap <>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		
		System.out.println("Mappa: " + map);
 
		map.clear();
		
		System.out.println("Mappa vuota: " + map);
	}

}
