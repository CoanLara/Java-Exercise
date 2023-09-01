package com.acn.lara;

import java.util.ArrayList;
import java.util.Arrays;

public class Esercizio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   /* Scrivere un programma Java per rimuovere il terzo elemento da un elenco di array*/
		
		    int num = 1;
	        int num2 = 2;
	        int num3 = 3;
	        int num4 = 4;
	        int num5 = 5;

	        ArrayList <Integer> elenco = new ArrayList <Integer> ();  

	        elenco.add(num);
	        elenco.add(num2);
	        elenco.add(num3);
	        elenco.add(num4);
	        elenco.add(num5);

	        

	        System.out.println("Array iniziale: ");

	        for (int i=0; i<elenco.size(); i++) {
	            System.out.println(elenco.get(i));

	        }

	       
	        //rimuovo il terzo elemento

	       
	        elenco.remove(2);

	        System.out.println("Stampo l'array con la rimozione del terzo elemento");

	        for (int i=0; i<elenco.size(); i++) {
	            System.out.println(elenco.get(i));

	            

	        }
	}

}
