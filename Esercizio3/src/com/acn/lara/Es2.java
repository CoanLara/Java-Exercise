package com.acn.lara;

import java.util.HashSet;

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scrivere un programma Java per scorrere tutti gli elementi HashSet*/
		
		HashSet <String> set = new HashSet<>();
		
		set.add("Lara");
		set.add("Emily");
		set.add("Mara");
		
		//metodo 1
		
		set.forEach((String) -> System.out.println(String));
		
		//metodo 2
		
		for( String nomi : set) {
			System.out.println(nomi);
		}
		
		
	}

}
