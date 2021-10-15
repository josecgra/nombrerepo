package es.zoo;

public class Pinguino extends Ave {
	public Pinguino() {
	}

	public Pinguino(Sexo s) {
		super(s);
	}
	
	@Override
	public void vuela() {
		System.out.println("Soy un ping�ino, no puedo volar");
	}

	public void programa() {
		System.out.println("Soy un ping�ino programador, estoy programando en Java");
	}

	public void nada() {
		System.out.println("Estoy nadando");
	}

	@Override
	public String corre(int km) {
		return "Soy un pinguino y estoy corriendo " + km + " kil�metros.";
	}
	
	
}
