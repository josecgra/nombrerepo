package es.eoi.multimedia;

import java.util.List;

public class Cancion1 implements Reproducible {

	private String titulo;
	private List<String> interpretes;
	
	public Cancion1(String titulo, List<String> interpretes) {
		super();
		this.titulo = titulo;
		this.interpretes = interpretes;
	}

	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public List<String> getInterpretes() {
		return interpretes;
	}



	public void setInterpretes(List<String> interpretes) {
		this.interpretes = interpretes;
	}



	@Override
	public String play() {
		return "Reproduciendo " + getTitulo();
	}

	@Override
	public String stop() {
		return "Finalizando Reproducción " + getTitulo();
	}

}
