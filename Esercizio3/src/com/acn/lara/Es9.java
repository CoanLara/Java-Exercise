package com.acn.lara;

import java.util.ArrayList;
import java.util.HashSet;

public class Es9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Scrivere un programma Java per convertire un HashSet in un List/ArrayList.
		
		HashSet <Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		ArrayList <Integer> list = new ArrayList<>(set);
		
		for(Integer lista : list) {
			System.out.println(lista);
		}
	}

}
