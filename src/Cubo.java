// la signatura de un m�todo tiene en cuenta, el n� de parametros, el tipo de esos par�metros y el orden de esos parametros
public class Cubo {
	
	private int altura;
	private int anchura;
	private int profundidad;
	
	public Cubo() {
		// inicializar las propiedades del objeto
		altura=10;
		anchura=10;
		profundidad=10;
	}
	
	public Cubo(int alt, int anch) {
		// funcion
		this.altura = alt; 
		this.anchura = anch;
		
	}
	

	
	public Cubo(String alt, int anch) {
		
		this.anchura = anch;
		
	}
	
	public Cubo(int alt, String anch) {
		
		
	}
	
	
	
	
	public Cubo(int alt, int anch, int prof) {
		
		
		
	}
	
	
	
	
}
