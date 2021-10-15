package es.eoi.multimedia;

import java.util.List;

public class Pelicula implements Reproducible {

	String titulo;
	List<String> actores;
	
	public Pelicula(String titulo, List<String> actores) {
		super();
		this.titulo = titulo;
		this.actores = actores;
	}

	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public List<String> getActores() {
		return actores;
	}



	public void setActores(List<String> actores) {
		this.actores = actores;
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
