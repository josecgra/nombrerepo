package es.vehiculos;

public class Bicicleta extends Vehiculo {
	  private int pinones; // n�mero de pi�ones
	  
	  public Bicicleta(int p) {
	    super();
	    this.pinones = p;
	  }

	  public void hazCaballito() {
	    System.out.println("Estoy haciendo el caballito");
	  }
}
