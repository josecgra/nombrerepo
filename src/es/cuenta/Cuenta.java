package es.cuenta;

public class Cuenta {
	
	public static double cantidadBanco;
		
	private String titular;
	private double cantidad;
	
	
	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getCantidad() {
		this.sumaPorcentaje();
		return cantidad;
	}

	public void ingresar(double cantidad) {
		if (cantidad > 0)
			this.cantidad = this.cantidad + cantidad;
			this.cantidadBanco = this.cantidadBanco + cantidad;
	}
	
	public void retirar(double cantidad) {
		this.cantidad = this.cantidad - cantidad;
		this.cantidadBanco = this.cantidadBanco - cantidad;
	}
	
	public double sumaInteres() {
		return cantidadBanco + 5;
	}
	
	private double sumaPorcentaje() {
		return cantidadBanco + 5;
	}
	
	public String mensaje() {
		return "Estoy llamando desde la clase Cuenta";
	}
	
	public String mostrar() {
		return this.getTitular() + " tiene " + this.getCantidad() + "€ en su cuenta";
	}


	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
