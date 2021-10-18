package es.vehiculos;

public class Avion extends Vehiculo {
	
	boolean despegar = false;
	boolean nodespegue = false;
	boolean tocarSuelo = false;
	boolean aterrizar = false;
	int velocidad = 100;
	int resistencia = 10;

	public String volar() {
		return "volando!!";
	}
	

	public boolean despegar() {
		if(velocidad==100 && tocarSuelo && resistencia == 8)
		despegar=true;
		return false;	
	}
	
	public boolean aterrizar() {
		if(velocidad<100 && tocarSuelo==true)
		aterrizar = false;
		return aterrizar;	

	}
	
}
