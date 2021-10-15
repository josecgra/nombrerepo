package es.animales;

public class Perro extends Animal {
	
	public Perro(String nombre, double peso, int altura) {
		super(nombre, peso, altura);
	}

	public String ladrar() {
		return "guauuuuu!!";
	}
	
	public int cociente(int a, int b) throws ArithmeticException{
		
		int c = 0;
		
		if (b == 0) {
			throw new ArithmeticException("En el método cociente (Perro), la division el denominador B es 0");
		} else {
			c = a / b;
		}
		
		return c;
	}
	
	
}
