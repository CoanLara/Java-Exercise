package com.acn.lara;

import java.util.ArrayList;

public class Esercizio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  //Scrivere un programma Java per verificare che un elenco di array sia vuoto o meno.

		
       ArrayList<String> elenco = new ArrayList<>();
		
		elenco.add("Primo elemento");
		elenco.add("Secondo elemento");
		elenco.add("Terzo elemento");
		
		System.out.println("Elenco pieno: " + elenco);
		
		//svuoto l'arrayList tramite il metodo clear
		
		elenco.clear();
		
		
		//verifichiamo che l'arrayList sia effettivamente vuoto
		
		boolean verifica = elenco.isEmpty();
		
		if(verifica) {
			System.out.println("L'ArrayList è vuoto");
		}else
			System.out.println("L'ArrayList non è stato svuotato correttamente");
		
	}

}
