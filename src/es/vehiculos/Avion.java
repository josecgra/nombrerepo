package es.vehiculos;

public class Avion extends Vehiculo {
	
	boolean despegar = false;
	boolean nodespegue = false;
	boolean tocarSuelo = false;
	boolean aterrizar = false;
	int velocidad = 100;
	int retraso = 7;
	
	

	public String volar() {
		return "volando!!";
	}
	

	public boolean despegar() {
		if(velocidad==100 && tocarSuelo && retraso == 7)
		despegar=true;
		return true;	
	}
	
	public boolean aterrizar() {
		if(velocidad<100 && tocarSuelo==true)
		aterrizar = false;
		return aterrizar;	

	}
	
}
