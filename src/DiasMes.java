import java.util.Scanner;

public class DiasMes {

	public static void main(String[] args) {

		// Programa que en base a un número de mes nos indica el numero de días que tiene
		Scanner sc = new Scanner(System.in);
		int num_mes;
		
		System.out.println("Introduce el mes: ");
		
		num_mes = sc.nextInt();
		
		// 1 .. 12 
		switch(num_mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("El mes " + num_mes + " tiene 31 días");
				break;
			case 2:
				System.out.println("El mes " + num_mes + " tiene 28/29 días");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("El mes " + num_mes + " tiene 30 días");
				break;
			default:
				System.err.println("has introducido un mes incorrecto!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("introduce el mes en cadena");
		String mes = sc.nextLine();

		
		if (mes.equals("5") || mes.equals("7") || mes.equals("8")) {
			System.out.print("el valor coincide");
		} else {
			System.out.print("el valor no coincide");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
