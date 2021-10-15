package es.animales;

public class Caballo extends Animal {

	public Caballo(String nombre, double peso, int altura) {
		super(nombre, peso, altura);
	}
	
	public String relinchar() {
		return "relincho!!";
	}
	
}
