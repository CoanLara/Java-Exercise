package com.acn.lara;

import java.util.HashMap;
import java.util.Set;

public class Es9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Scrivere un programma Java per creare una vista impostata delle 
	 mappature contenute in una mappa */	
		
		
		HashMap <String, Integer> mappa = new HashMap<>();
		
		mappa.put("walter", 67);
		mappa.put("rita", 15);
		mappa.put("carmen", 17);
		
		//creo la vista impostata
		
		Set<HashMap.Entry <String, Integer>> mappaImpostata = mappa.entrySet();
		
		System.out.println(mappaImpostata);
		
	
		
		
	}

}
