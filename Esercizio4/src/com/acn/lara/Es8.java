package com.acn.lara;

import java.util.TreeMap;

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Scrivere un programma Java per ottenere una mappatura chiave-valore 
 * associata alla chiave massima e alla chiave minima in una mappa */
		
		   TreeMap <Integer, String> map= new TreeMap<>();

		   

	        int chiave1= 80;
	        int chiave2= 55;
	        int chiave3=10;
	        

	        String valore1 ="Mara";
	        String valore2="Lara";
	        String valore3= "Emily";
	 

	        map.put(chiave1, valore1);
	        map.put(chiave2, valore2);
	        map.put(chiave3, valore3);

	 
	        //primo metodo 
	        
	        int maxKey=chiave1;
	        int minKey=chiave1;
    

	        for (int key : map.keySet()) {
	            if (key>maxKey)
	                maxKey=key;
	        }  

	        for (int key : map.keySet()) {
	            if (key<minKey)
	                minKey=key;
	        }
	  
	        

	        for(int chiave: map.keySet()) {
	            if (chiave==maxKey || chiave == minKey) {
	                System.out.println(chiave + " - " +map.get(chiave));
	            }

	        }
	        
	        //secondo metodo
	        
	        
	        System.out.println(map.lastEntry());
	        System.out.println(map.firstEntry());

	}

}
