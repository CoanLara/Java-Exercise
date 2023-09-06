package 
com.acn.lara;

import java.util.HashMap;

public class Es12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Scrivere un programma Java per ottenere una vista della raccolta
	  dei valori contenuti in questa mappa */	
		
		
		HashMap <String, String> mappa = new HashMap<>();
		
		mappa.put("Nadia", "Palla");
		mappa.put("Vito", "Rino");
		mappa.put("Stella", "Cadente");
		
		System.out.println(mappa.values());
		
	}

}
