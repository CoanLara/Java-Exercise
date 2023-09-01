package com.acn.lara;

import java.util.ArrayList;

public class Esercizio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scrivere un programma Java per stampare tutti gli elementi di un ArrayList
    //utilizzando la posizione degli elementi.	 
		
		
        ArrayList<Integer> elenco = new ArrayList<>();

        // Aggiungere alcuni elementi all'ArrayList
        
        elenco.add(1);
        elenco.add(2);
        elenco.add(3);
        elenco.add(4);
        elenco.add(5);

        // Stampare tutti gli elementi utilizzando la posizione (indice)
        
        for (int i = 0; i < elenco.size(); i++) {
            Integer elemento = elenco.get(i);  
            System.out.println("Elemento alla posizione " + i + ": " + elemento);
        }
	}

}
