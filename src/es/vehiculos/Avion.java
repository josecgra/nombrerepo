package es.vehiculos;

public class Avion extends Vehiculo {
	
	boolean despegar = false;
	boolean tocarSuelo = false;
	boolean aterrizar = false;
	int velocidad = 100;
	
	

	public String volar() {
		return "volando!!";
	}
	
	public boolean despegar() {
		if(velocidad==100 && tocarSuelo)
		despegar=true;
		return despegar;	
	}
	
	public boolean aterrizar() {
		if(velocidad<100 && tocarSuelo==true)
		aterrizar = false;
		return aterrizar;	
	}
	
}
