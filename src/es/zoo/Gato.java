package es.zoo;

public class Gato {

	private String raza;
	private String sexo;

	public Gato(String s) {
		this.sexo = s;
	}

	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void maulla() {
		System.out.println("Miauuuu");
	}

	public void ronronea() {
		System.out.println("mrrrrrr");
	}

	public Gato apareaCon(Gato g) throws ExcepcionApareamientoImposible {
		
		Gato nuevo = null;
		
		if (this.getSexo().equals(g.getSexo())) {
			throw new ExcepcionApareamientoImposible("Los gatos son del mismo sexo");
		} else {
			nuevo = new Gato("macho");
		}
		
		return nuevo;
		
	}
	
	
	
//	public ....
//	      (si gato es del mismo sexo que el que viene por parametros)
//	         --> new.... 
//	      g = new Gato("hombre o mujer");
//	         return g;
	
}
