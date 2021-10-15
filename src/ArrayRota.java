import java.util.Scanner;

public class ArrayRota {

	public static void main(String[] args) {
		
		int[] numero = new int[15];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducir los numeros: ");
		
		for (int i = 0; i < 15; i++) {
			numero[i] = sc.nextInt();
		}
		
		System.out.println("Vector de numeros sin rotar: ");
		for (int i = 0; i < 15; i++) {
			System.out.print(numero[i] + " ");
		}
		
		
		int aux = numero[14];
		for (int i = 14; i > 0; i--) {
			numero[i] = numero[i-1];
		}
		numero[0] = aux;
		
		
		System.out.println();
		System.out.println("Vector de numeros rotado: ");
		for (int i = 0; i < 15; i++) {
			System.out.print(numero[i] + " ");
		}
		
		
		

	}

}
