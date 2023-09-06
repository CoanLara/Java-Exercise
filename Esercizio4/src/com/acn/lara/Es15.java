package com.acn.lara;

import java.util.Scanner;
import java.util.TreeMap;

public class Es15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Scrivere un programma Java per ottenere la chiave minima strettamente 
	 * maggiore della chiave data. Restituisce null se non esiste tale chiave */	
		
		Scanner sc= new Scanner (System.in);

	    TreeMap <Integer, String> map = new TreeMap <>();
	    
	    map.put(1, "Lara");
	    map.put(2, "Emily");
	    map.put(3, "Mara");


	    System.out.println("Scegli una chiave");
	    Integer chiaveData= sc.nextInt();

	 
	    Integer chiaveTrovata = map.ceilingKey(chiaveData);
	    String valore = map.get(chiaveData); 

	    System.out.println(chiaveTrovata +" - "+ valore);

	    
	    //secodno metodo 
	    Integer chiaveTrovata2 = map.higherKey(chiaveData);
	 
	}

}
