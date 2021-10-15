import java.util.Scanner;

public class AdivinaPassIntentos {

	public static void main(String[] args) {

		// Escribe un programa que pida un nom de usuario y una pass, si se ha
		// introducido "pepe" y "asdasd" se
		// indica un mensaje de "Has entrado en el sistema", sino mostrará un mensaje de
		// error
		// AMPLIACION: mejorarlo para controlar hasta 3 intentos

		String nom_usuario, pass;
		Scanner sc = new Scanner(System.in);
		int intentos = 0;
		boolean acierto = false;
		
		
		do {
			System.out.print("Escribe el nombre de usuario: ");
			nom_usuario = sc.nextLine();

			System.out.print("Escribe tu contraseña: ");
			pass = sc.nextLine();

			if (nom_usuario.equals("pepe") && pass.equals("asdasd")) {
				System.out.println("Has entrado en el Sistema");
				acierto = true;
			} else {
				System.err.println("Error de login");
				intentos++;
			}
			System.out.println();
		} while (intentos < 3 && !acierto);
		
		if (!acierto) {
			System.err.println("Has superado el número de intentos");
		}

				
		
		
		
	}

}
