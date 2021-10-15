package es.cuenta;

public class CuentaJoven extends Cuenta {

	private int edad;
	
	public CuentaJoven(String titular) {
		super(titular);
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String mensaje() {
		return "Estoy llamando desde la clase Cuenta Joven";
	}

	private int getFinanciacion() {
		this.sumaInteres();
		return 5;
	}
	
	
}
