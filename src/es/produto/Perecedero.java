package es.produto;

public class Perecedero extends Producto {
	
	private int diasCaducidad;

	public Perecedero(String nombre, double precio, int diasCaducidad) {
		super(nombre, precio);
		this.diasCaducidad = diasCaducidad;
	}

	public int getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(int diasCaducidad) {
		this.diasCaducidad = diasCaducidad;
	}

	@Override
	public String toString() {
		return super.toString() + " Perecedero [diasCaducidad=" + diasCaducidad + "]";
	}

	@Override
	public double calcular(int cantidad) {
		
		double precioFinal = super.calcular(cantidad);
		
			
		switch(diasCaducidad) {
			case 1:
				precioFinal = precioFinal / 4;
				break;
			case 2:
				precioFinal = precioFinal / 3;
				break;
			case 3:
				precioFinal = precioFinal / 2;
				break;
		}
		
		return precioFinal;
		
	}

	
	
	
}
