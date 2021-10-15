package es.vehiculos;

public class Patinete extends Vehiculo {
	private int numruedas;

	public Patinete(int numruedas) {
		super();
		this.numruedas = numruedas;
	}
	
	public String derrapa() {
		return "derrapando!!";
	}
	
}
