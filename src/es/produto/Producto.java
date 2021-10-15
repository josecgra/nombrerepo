package es.produto;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean mayor;
	
	
	public Producto() {
		super();
	}
	// Constructor con parámetros
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	public boolean hasMayor() {
		return mayor;
	}

	public void setMayor(boolean mayor) {
		this.mayor = mayor;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	// tipo devuelto - nombre - tipo parametros - nº de parametros - orden de los parametros
	public double calcular(int m, int cantidad, int h, int t) {
		return precio * cantidad;
	}
	
	public int calcularIrpfConElIvaDescentralizado(int cantidad, int catn2, int s) {
		return cantidad;
	}
	
	
	
}
