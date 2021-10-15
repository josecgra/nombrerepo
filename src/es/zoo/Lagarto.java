package es.zoo;

public class Lagarto extends Animal {
	  
	public Lagarto() {}

	  public Lagarto(Sexo s) {
	    super(s);
	  }

	  public void tomaElSol() {
	    System.out.println("Estoy tomando el Sol");
	  }

	  public void baniate() {
	    System.out.println("Me estoy dando un chapuz�n");
	  }

	  public void escondete() {
	    System.out.println("Me he escondido, ya no me puedes ver");
	  }

	@Override
	public String corre(int km) {
		return "Soy un lagarto y estoy corriendo " + km + " kil�metros.";
	}
	  
	  
}
