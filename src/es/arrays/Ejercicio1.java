package es.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(7);
		lista.add(3);
		lista.add(9);
		lista.add(1);
		
		
		Collections.sort(lista);
		
		for(Integer i : lista)
			System.out.print(i + " ");
		
		
		
		

	}

}
