package es.ejerobj;

import java.util.Scanner;

import es.cuenta.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		Persona[] personas = new Persona[10];
		Scanner sc = new Scanner(System.in);
		Cuenta c1 = new Cuenta("Carlos");
		
		c1.sumaInteres();
		
		String nom;
		String ape;
		int edad;
		String fecnac;
		String ciudad;
		String trabaja;
		String estudia;
		

		
		// Rellenamos el vector de Personas
		
		for(int i = 0; i < 2; i++) {
			System.out.println("**** DATOS DE LA PERSONA " + i + "****");
			System.out.print("Nombre: ");
			nom = sc.nextLine();
			System.out.print("Apellidos: ");
			ape = sc.nextLine();
			System.out.print("Edad: ");
			edad = sc.nextInt();
			sc.nextLine();
			System.out.print("Fecha Nac: ");
			fecnac = sc.nextLine();
			System.out.print("Ciudad: ");
			ciudad = sc.nextLine();
			System.out.print("Trabaja? (SI/NO): ");
			trabaja = sc.nextLine();
			System.out.print("Estudia? (SI/NO): ");
			estudia = sc.nextLine();
			System.out.println("----------------------------------------");
			
			personas[i] = new Persona(nom,ape,edad,fecnac,ciudad,trabaja,estudia);
		}
		
		String trabajo;
		String estudio;
		
		// Mostramos el mensaje por cada persona
		for(int i = 0; i < 2; i++) {
			System.out.println("Hola me llamo " + personas[i].getNombre() + " "+ personas[i].getApellidos() + " y tengo " + personas[i].getEdad() + " años.");
			System.out.println("Nací el " + personas[i].getFechaNacimiento() + " y vivo en " + personas[i].getCiudad());
			
			if (personas[i].getTrabajando())
				trabajo = "estoy trabajando";
			else
				trabajo = "no estoy trabajando";
			
			if (personas[i].getEstudiando())
				estudio = "estoy estudiando";
			else
				estudio = "no estoy estudiando";
			
			System.out.println("Actualmente " + trabajo + " y " + estudio + ".");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
