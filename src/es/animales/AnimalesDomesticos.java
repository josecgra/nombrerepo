package es.animales;

import java.util.ArrayList;

public class AnimalesDomesticos {

	public static void main(String[] args) {
		
		ArrayList<Animal> animales = new ArrayList<Animal>();
		
		Animal a1 = new Animal("Pepe", 4.5, 1);
		Perro p1 = new Perro("Luna", 5.5, 5);		
		Animal p2 = new Perro("Guapo",3.3,5);
		
		
		try {
			p1.cociente(8, 0);
		} catch (ArithmeticException ex) {
			System.err.println(ex.getMessage());
		}
		
		
		
		
		int i = 0;
		
		animales.add(a1);
		animales.add(p1);
		animales.add(p2);
	
		
		Object[] arrayanimales = animales.toArray();
		
		for (Object o : arrayanimales) {
			System.out.print(o + " ");
		}
		
		// for moderno sin indices
//		for(Animal a : animales) {
//			
//			if (a instanceof Perro)
//				a.setNombre("Jose Carlos");
//			
//			System.out.println(a);
//		}
		
//		// for viejete
//		for(int j = 0; j < animales.size(); j++) {
//			
//			if (animales.get(j) instanceof Perro) {
//				System.out.println(animales.get(j).getNombre() + " es un perro");
//			}
//			
//			if (animales.get(j) instanceof Gato) {
//				System.out.println(animales.get(j).getNombre() + " es un gato");
//			}
//			
//			if (animales.get(j) instanceof Raton) {
//				System.out.println(animales.get(j).getNombre() + " es un raton");
//			}
//			
//		}
//	
//		
		
		/*
		
		Animal[] animales = new Animal[15];
		
		animales[0] = new Perro("Luna",4.5,1);
		animales[1] = new Perro("Juana",5.5,2);
		animales[2] = new Perro("Ursula",8.5,3);
		animales[3] = new Perro("Ursula",8.5,3);
		animales[4] = new Perro("Ursula",8.5,3);

		animales[5] = new Gato("Iris",4.5,1);
		animales[6] = new Gato("Pepe",5.5,2);
		animales[7] = new Gato("Tony",8.5,3);
		animales[8] = new Gato("Tony",8.5,3);
		animales[9] = new Gato("Tony",8.5,3);
		
		animales[10] = new Raton("Aroa",444,1);
		animales[11] = new Raton("Luisa",5.5,2);
		animales[12] = new Raton("Flamenca",8.5,3);
		animales[13] = new Raton("Flamenca",8.5,3);
		animales[14] = new Raton("Flamenca",8.5,3);
				
		
		String tipoAnimal = "";
		double pesoMaximo = 0;
		int indicePesoMaximo = 0;
		
		for(int i = 0; i < animales.length; i++) {
			
		    if (animales[i] instanceof Perro)
		    	tipoAnimal = "Perro";
		    if (animales[i] instanceof Gato)
		    	tipoAnimal = "Gato";
		    if (animales[i] instanceof Raton)
		    	tipoAnimal = "Raton";
		    
			System.out.println(animales[i].getNombre() + " es un " + tipoAnimal + " pesa " + animales[i].getPeso() + " y mide " + animales[i].getAltura());
			
			// Aqui evaluo el peso del animal
			if (pesoMaximo < animales[i].getPeso()) {
				pesoMaximo = animales[i].getPeso();
				indicePesoMaximo = i;
			}
				
			
		}
		
		
		System.out.println("El animal más pesado es: " + animales[indicePesoMaximo].getNombre() + " con " + animales[indicePesoMaximo].getPeso() + " Kg.");
		
		*/
	}

}
