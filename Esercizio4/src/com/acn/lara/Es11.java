package com.acn.lara;

import java.util.TreeMap;

public class Es11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Scrivere un programma Java per ottenere una mappatura chiave-valore 
 *associata alla chiave più grande minore o uguale alla chiave data*/
		
		TreeMap <Integer, Integer> map = new TreeMap <>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		
		Integer chiaveData = 4;
		
		Integer trovaChiave = map.floorKey(chiaveData);
		
		if(trovaChiave!= null) {
			Integer valoreAssociato = map.get(trovaChiave);
			  System.out.println("Chiave più grande minore o uguale: " + trovaChiave);
	            System.out.println("Valore associato: " + valoreAssociato);
	        } else {
	            System.out.println("Nessuna chiave trovata minore o uguale alla chiave data.");
	        
		}
		
		
	}

}
