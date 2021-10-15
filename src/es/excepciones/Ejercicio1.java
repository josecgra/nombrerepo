package es.excepciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("Por favor, vaya introduciendo n�meros enteros.");

		Scanner s = new Scanner(System.in);

		int maximo = 0;

		for (int i = 1; i < 7; i++) {

			boolean datoValido = false;
			int numero = 0;

			do {
				try {
					System.out.print("N� " + i + ": ");
					numero = Integer.parseInt(s.nextLine());
					datoValido = true;
				} catch (Exception e) {
					System.out.println("El dato introducido no es correcto, debe ser un n�mero entero.");
					System.out.println("Por favor, int�ntelo de nuevo.");
				}
			} while (!datoValido);

			if (numero > maximo) {
				maximo = numero;
			}
		}

		System.out.println("El valor m�ximo introducido es " + maximo);

	}

}
