package es.zoo;


public class PruebaAnimales {

	public static void main(String[] args) {
	    
		
		Gato g1 = new Gato("macho");
		Gato g2 = new Gato("hembra");
		Gato g3 = new Gato("macho");
		Gato g4;
		
		try {
			g4 = g2.apareaCon(g3);
		} catch (ExcepcionApareamientoImposible e) {
			System.out.println("No puede ser, los gatos son del mismo sexo");			
		}	
		
		
	}

}
