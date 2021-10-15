package es.interfaces;

public class PruebaArrayReales {

	public static void main(String[] args) {
		
		ArrayReales x = new ArrayReales(5);
		
		x.asignar();
		
		for(int i = 0; i < x.getVector().length; i++) {
			System.out.print(x.getVector()[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("El valor mínimo es: " + x.minimo());
		System.out.println("El valor máximo es: " + x.maximo());
		System.out.println("La suma de todo es: " + x.sumatorio());
		
		
	}

}
