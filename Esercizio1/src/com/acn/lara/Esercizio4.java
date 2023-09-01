package com.acn.lara;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per recuperare un elemento 
	(in corrispondenza di un indice specificato) da un dato elenco di array.
	 */
		int [] elenco = {34,5,7,12,24,17};
		
		System.out.println("Stampa l'elemento alla seconda posizione");
		System.out.println(elenco[2]);
		
		
		//METODO 2
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quale elemento vuoi recuperare?");
		int x = scanner.nextInt();
		
		System.out.println("Elemento recuperato: " + elenco[x]);
		
		
		
		
	}

}
