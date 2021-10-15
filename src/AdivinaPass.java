import java.util.Scanner;

public class AdivinaPass {

	public static void main(String[] args) {
		
		// Escribe un programa que pida un nom de usuario y una pass, si se ha introducido "pepe" y "asdasd" se
		// indica un mensaje de "Has entrado en el sistema", sino mostrará un mensaje de error
		
		String nom_usuario, pass;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el nombre de usuario: ");
		nom_usuario = sc.nextLine();
		
		System.out.print("Escribe tu contraseña: ");
		pass = sc.nextLine();
		
		if (nom_usuario.equals("pepe") && pass.equals("asdasd")) {
			System.out.print("Has entrado en el Sistema");
		} else {
			System.err.print("Error de login");
		}
		
	}

}
