package es.eoi.multimedia;

import java.util.ArrayList;
import java.util.List;

public class Multimedia {

	public static void main(String[] args) {
		
		List<Reproducible> lista = new ArrayList<Reproducible>();
		
		ArrayList<String> actores = new ArrayList<String>();
		actores.add("Al Pacino");
		actores.add("Robert De Niro");
		
		ArrayList<String> interpretes = new ArrayList<String>();
		interpretes.add("Pastora Soler");
		interpretes.add("El Chojin");
		
		lista.add(new Pelicula("El Padrino",actores));
		lista.add(new Pelicula("Los Otros",actores));
		lista.add(new Pelicula("La Playa",actores));
		lista.add(new Pelicula("Los Vengadores",actores));
		lista.add(new Pelicula("El último de la fila",actores));
		lista.add(new Cancion("Sol de invierno",interpretes));
		lista.add(new Cancion("La Gasolina",interpretes));
		lista.add(new Cancion("We Are The Champions",interpretes));
		lista.add(new Cancion("Eye of the tiger",interpretes));
		lista.add(new Cancion("Burning heart",interpretes));
		

		for (Reproducible r : lista) {
			System.out.println(r.play());
		}
		
		for (Reproducible r : lista) {
			System.out.println(r.stop());
		}
		
		
		
		
		
	}

}
