package com.acn.lara;

import java.util.Scanner;
import java.util.TreeMap;

public class Es16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per ottenere una mappatura 
	 chiave-valore associata alla chiave più grande,
	  strettamente inferiore alla chiave data. 
	  Restituisce null se non esiste tale chiave */	
		
		
		Scanner sc= new Scanner (System.in);	 

        TreeMap <Integer, String> map= new TreeMap <>();
        
        int chiave1 = 1;
        int chiave2 = 2;
        int chiave3 = 3;
        int chiave4 = 4;

 
        String valore1 = "Rosso";
        String valore2 = "Blu";
        String valore3 = "Rosa";
        String valore4 = "Verde";


        map.put(chiave1, valore1);
        map.put(chiave2, valore2);
        map.put(chiave3, valore3);
        map.put(chiave4, valore4);


        System.out.println("Scegli una chiave");
        Integer chiaveData= sc.nextInt();
        Integer chiaveTrovata = map.lowerKey(chiaveData);
        String valore = map.get(chiaveData);

        System.out.println(chiaveTrovata +" - "+ valore);

        sc.close();
	}

}
