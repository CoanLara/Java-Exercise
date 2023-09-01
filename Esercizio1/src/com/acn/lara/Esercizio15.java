package com.acn.lara;

import java.util.ArrayList;

public class Esercizio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scrivere un programma Java per unire due elenchi di array
		
	    // Creare due ArrayList di stringhe
   
		ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

	    // Aggiungere alcuni elementi agli ArrayList
        
        lista1.add("Elemento 1");
   	    lista1.add("Elemento 2");

		lista2.add("Elemento 3");
		lista2.add("Elemento 4");

		//stampa dei due array prima dell'unione
		
		System.out.println(lista1);
		System.out.println(lista2);
	    // Creare un nuovo ArrayList per unire i due ArrayList
		
		ArrayList<String> listeUnificate = new ArrayList<>(lista1);

        // Unire il secondo ArrayList all'ArrayList unificato
		       
		listeUnificate.addAll(lista2);

	    // Stampare l'ArrayList unificato
		
		System.out.println("ArrayList unificato: " + listeUnificate);
		
		
		    }
		

	

}
