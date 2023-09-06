package com.acn.lara;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Es10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere una visualizzazione 
 in ordine inverso delle chiavi contenute in una determinata mappa*/
		
		TreeMap <Integer, Integer> map = new TreeMap<>();
		
		map.put(1, 2);
		map.put(2, 4);
		map.put(3, 4);
		map.put(5, 9);
		
		//creo una visualizazzione in ordine inverso delle chiavi
		
		NavigableSet <Integer> chiaviInverse = ((TreeMap<Integer, Integer>) map).descendingKeySet();
		
		//stampo le chiavi in ordine inverso
		
		System.out.println("Chiavi in ordine inverso: ");
		for(Integer chiavi : chiaviInverse) {
			System.out.println(chiavi);
		}
		
	}

}
