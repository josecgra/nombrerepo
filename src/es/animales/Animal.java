package es.animales;

public class Animal {
	
	public String nombre;
	private double peso;
	private int altura;
	
	public Animal(String nombre, double peso, int altura) {
		this.altura = altura;
		this.nombre = nombre;
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
