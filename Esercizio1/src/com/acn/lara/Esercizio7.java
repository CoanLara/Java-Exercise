package com.acn.lara;

import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     //Scrivere un programma Java per cercare un elemento in un elenco di array.

       
        int[] array = {1, 2, 3, 4, 5};

        // Input dell'elemento da cercare

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi la posizione in cui si trova l'elemento da recuperare: ");
        int x = scanner.nextInt();

 

        // Ciclo for per cercare l'elemento nell'array

        boolean trovato = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                trovato = true;
                break; // Esci dal ciclo se l'elemento è stato trovato

            }

        }

        System.out.println("elemento recuperato: "+ array[x]);
	}

}
