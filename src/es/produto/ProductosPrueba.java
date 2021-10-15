package es.produto;

import java.util.Random;

public class ProductosPrueba {

	public static void main(String[] args) {

		Producto[] productos = new Producto[10];
		
		productos[0] = new Perecedero("Manzana", 1.5, 5); // -> precioFinal
		productos[1] = new Perecedero("Pera", 2.5, 3); // -> precioFinal
		productos[2] = new Perecedero("Yogurt", 0.5, 3);
		productos[3] = new Perecedero("Leche", 1.0, 2);
		productos[4] = new Perecedero("Jamon", 3.5, 5);

		productos[5] = new NoPerecedero("Agua", 1, "liquido");
		productos[6] = new NoPerecedero("Lata", 2, "tipo2");
		productos[7] = new NoPerecedero("Miel", 5, "tipo1");
		productos[8] = new NoPerecedero("Lapiz", 0.3, "tipo3");
		productos[9] = new NoPerecedero("Folios", 2, "tipo4");
		
		Random r = new Random();
		int cantidad = 0;
		double sumaTotal = 0;
		
		for(int i = 0; i < productos.length; i++) {
			
			cantidad = r.nextInt(10)+1;
			System.out.println("Compro " + cantidad + " unidades de: " + productos[i].toString() + " " + "| subtotal: " + productos[i].calcular(cantidad) + " €");			
			sumaTotal = sumaTotal + productos[i].calcular(cantidad);

		}
		
		System.out.println();
		System.out.println("Finalmente la compra total sale por: " + sumaTotal + " €");
		
	}

}
