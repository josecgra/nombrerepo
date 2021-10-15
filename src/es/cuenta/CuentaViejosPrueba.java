package es.cuenta;

public class CuentaViejosPrueba {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("Antonio");
		CuentaJoven cj = new CuentaJoven("Antonia");
		
		
		c1.sumaInteres();
		cj.sumaInteres();
		

	}

}
