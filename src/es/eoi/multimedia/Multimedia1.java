package es.eoi.multimedia;

import java.util.ArrayList;
import java.util.List;

public class Multimedia1 {

	public static void main(String[] args) {


		ArrayList<Reproducible> lista = new ArrayList<Reproducible>();
		List<String> actores = new ArrayList<String>();
		List<String> actores1 = new ArrayList<String>();
		List<String> actores2 = new ArrayList<String>();
		List<String> interpretes = new ArrayList<String>();
		
		actores.add("Al Pacino");
		actores.add("Robert De Niro");
		
		actores1.add("Tom Hanks");
		actores1.add("Meg Ryan");
		
		actores2.add("Jim Carrey");
		actores2.add("Heather Ledger");
		
		interpretes.add("Pastora Soler");
		interpretes.add("El Chojin");
		
		lista.add(new Pelicula("El Padrino",actores));
		lista.add(new Pelicula("Los Otros",actores1));
		lista.add(new Pelicula("La Playa",actores2));
		lista.add(new Pelicula("Los Vengadores",actores));
		lista.add(new Pelicula("El último de la fila",actores2));
		lista.add(new Cancion("Sol de invierno",interpretes));
		lista.add(new Cancion("La Gasolina",interpretes));
		lista.add(new Cancion("We Are The Champions",interpretes));
		lista.add(new Cancion("Eye of the tiger",interpretes));
		lista.add(new Cancion("Burning heart",interpretes));

		for (Reproducible p : lista) {
			if (p instanceof Pelicula) {
				String a = ((Pelicula) p).getActores().get(0);
				System.out.println(p.play() + " (" + a + ")");
			} else {
				System.out.println(p.play());
			}
			
		}
		
		for (Reproducible p : lista) {
			System.out.println(p.stop());
		}
		
		
	}

}
