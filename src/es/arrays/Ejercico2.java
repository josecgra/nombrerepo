package es.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercico2 {

	public static void main(String[] args) {


		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < 5; i++) {
			System.out.print("Introduce un numero: " );
			lista.add(Integer.parseInt(sc.nextLine()));
		}
		
		System.out.println();
		
		for (Integer i : lista) {
			System.out.print(" " + i);
		}
		
		Collections.sort(lista);
		System.out.println();
		for (Integer i : lista) {
			System.out.print(" " + i);
		}
		
		
		
		
		
		

	}

}
