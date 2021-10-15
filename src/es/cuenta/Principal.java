package es.cuenta;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("Jose Carlos");
		Cuenta c2 = new Cuenta("Antonio");
		Cuenta c3 = new Cuenta("Lorena");
		Cuenta c4 = new Cuenta("Luis");
		CuentaJoven cj = new CuentaJoven("Joven");
		
		System.out.println(c1.mensaje());
		System.out.println(cj.mensaje());
		
		
		
//		System.out.println(c1.mostrar());
//		System.out.println(c2.mostrar());
//		System.out.println(c3.mostrar());
//		System.out.println(c4.mostrar());
//
//		System.out.println("Cuenta de balance del BANCO: " + Cuenta.cantidadBanco);
//		
		
		c1.ingresar(2000);
		c2.ingresar(2500);
		c3.ingresar(2800);
		c4.ingresar(1000);
		cj.ingresar(4000);
		
		
		
//		System.out.println(c1.mostrar());
//		System.out.println(c2.mostrar());
//		System.out.println(c3.mostrar());
//		System.out.println(c4.mostrar());
//		System.out.println(cj.mostrar());
//		System.out.println("Cuenta de balance del BANCO: " + Cuenta.cantidadBanco);

	}

}
