package es.excepciones;

import java.util.Scanner;

public class Ejercicio1a {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int num = 0;
		int max = 0;
		boolean valido = false;
		
		for (int i = 1; i < 7; i++) {
			
			do {	
				try {
					System.out.print("Introduce el n�mero " + i + ": ");
					num = Integer.parseInt(sc.nextLine());
					valido = true;
				} catch (NumberFormatException e) {
					System.out.println("Num�ro incorrecto.");
				}	
			} while (!valido);
			
			valido = false;
			
			if (num > max)
				max = num;
		}
		
		System.out.println("El n�mero mayor es: " + max);
		
	}

}
