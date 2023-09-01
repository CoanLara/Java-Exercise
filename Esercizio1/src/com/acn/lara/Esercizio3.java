package com.acn.lara;

public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scrivere un programma Java per inserire un elemento nell'elenco dell'array 
		 nella prima posizione.*/
		
		int [] elenco = {2,2,3,4,5};
		int nuovoElemento = 1;
	
		for (int i = 0; i > elenco.length-1; i++) {
			elenco[i] = elenco[i+1];
			
		}
		
		elenco [0] = 1;
		
		System.out.println("Stampa dell'array dopo l'inserimento del nuovo valore");
		
		for(int elemento : elenco) {
			System.out.println(elemento);
		}
		
	}

}
