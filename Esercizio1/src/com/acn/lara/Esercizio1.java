package com.acn.lara;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scrivere un programma Java per creare un nuovo elenco di array,
		aggiungere alcuni colori (stringa) e stampare la raccolta.
		*/

		
		String[] colori = new String [7];
		
		colori[0] = "Blu";
		colori[1] = "Arancione";
		colori[2] = "Giallo";
		colori[3] = "Verde";
		colori[4] = "Nero";
		colori[5] = "Viola";
		colori[6] = "Bianco";
		
		
		System.out.println("Colori presenti nella raccolta: ");
		
		for(String colore : colori) {
			System.out.println(colore);
		}
		
		
	}

}
