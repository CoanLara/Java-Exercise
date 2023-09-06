package com.acn.lara;

import java.util.HashMap;

public class Es9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Scrivere un programma Java per ottenere la prima chiave 
	 (la più bassa) e l'ultima (la più alta) attualmente presenti 
	 in una mappa */	
		
		       
		HashMap<Integer, String> mappa = new HashMap<>();
		        
       // Aggiungi elementi alla mappa
		      
		mappa.put(5, "Valore 5");
	    mappa.put(2, "Valore 2");
	    mappa.put(8, "Valore 8");    
	    mappa.put(1, "Valore 1");
		        
	
	    // Ottieni la prima chiave (la più bassa)
	
	    Integer primaChiave = null;
	    for (Integer chiave : mappa.keySet()) {
            primaChiave = chiave;
	        break; // Esci dal ciclo dopo aver ottenuto la prima chiave
	       }
		        
		
	    // Ottieni l'ultima chiave (la più alta)
		 
	    Integer ultimaChiave = null;
	    for (Integer chiave : mappa.keySet()) {
	    	ultimaChiave = chiave;
		        }
		        
	      // Stampa la prima e l'ultima chiave
		 
	    if (primaChiave != null) {
	    	System.out.println("Prima chiave: " + primaChiave);
	     } else {
	    	 System.out.println("La mappa è vuota.");
		        }
		        
		 if (ultimaChiave != null) {
		     System.out.println("Ultima chiave: " + ultimaChiave);
	      } else {
             System.out.println("La mappa è vuota.");
	      }
		

		
	}

}
