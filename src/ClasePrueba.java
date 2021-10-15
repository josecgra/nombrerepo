import java.util.Scanner;

public class ClasePrueba {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa calcula la media de dos numeros");
		
		double numero1 = 0;
		double numero2 = 0;
		
		try {
			System.out.print("Introduce el primero numero: ");
			numero1 = Double.parseDouble(sc.nextLine());
			
			if (numero1 == 7) {
				throw new NullPointerException();
			}
				
			System.out.print("Introduce el segundo numero: ");
			numero2 = Double.parseDouble(sc.nextLine());
			
			System.out.println("La media de los dos números es: " + (numero1 + numero2) / 2);
		} catch (Exception e) {
			
			System.out.println(e.getClass());
			if (e instanceof Exception) {
				System.out.println("Efectivamente e es un objeto de Exception!");
			}
			
		} 
		
		
		
		
		
	}
}
