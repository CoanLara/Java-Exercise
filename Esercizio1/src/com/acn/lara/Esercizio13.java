package com.acn.lara;

import java.util.Arrays;

public class Esercizio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scrivere un programma Java per confrontare due elenchi di array
		
				int []elenco1 = {1, 2, 3, 4};
				int []elenco2 = {5, 6, 1, 8};
				
				  // Confronto dei due array

		        boolean sonoUguali = Arrays.equals(elenco1, elenco2);

		        if (sonoUguali) {
		            System.out.println("I due array sono uguali");
		        } else {
		            System.out.println("I due array sono diversi");

		        }
	}

}
