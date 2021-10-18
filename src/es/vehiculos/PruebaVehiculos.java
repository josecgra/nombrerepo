package es.vehiculos;

import java.util.Scanner;

/**
 * 2. Crea la clase Vehiculo , as� como las clases Bicicleta y Coche
 *    como subclases de la primera. Para la clase Vehiculo , crea los
 *    atributos de clase vehiculosCreados y kilometrosTotales , as� como
 *    el atributo de instancia kilometrosRecorridos . Crea tambi�n alg�n
 *    m�todo espec�fico para cada una de las subclases. Prueba las
 *    clases creadas mediante un programa con un men� como el que se
 *    muestra a continuaci�n:
 *    VEH�CULOS
 *    =========
 *    1. Anda con la bicicleta
 *    2. Haz el caballito con la bicicleta
 *    3. Anda con el coche
 *    4. Quema rueda con el coche
 *    5. Ver kilometraje de la bicicleta
 *    6. Ver kilometraje del coche
 *    7. Ver kilometraje total
 *    8. Salir
 *    Elige una opci�n (1-8):
 * 
 */
public class PruebaVehiculos {

	public static void main(String[] args) {
		
	    int opcion = 0;
	    int km;
	    Scanner sc = new Scanner(System.in);
	    
	    Patinete patinete = new Patinete(4);
	    Avion avion = new Avion();
	    
	    System.out.println(avion.volar());
	    
	    Bicicleta bhSpeedrom = new Bicicleta(9);
	    Coche saab93 = new Coche(1900);
	    Coche mustang = new Coche(5000);
	    Vehiculo v = new Vehiculo();
	    
	    System.out.println(patinete.derrapa());
	    
	    System.out.println(v.toString());
	    
	    
	    while (opcion != 9) {
	      System.out.println("1. Anda con la bicicleta");
	      System.out.println("2. Haz el caballito con la bicicleta");
	      System.out.println("3. Anda con el coche");
	      System.out.println("4. Quema rueda con el coche");
	      System.out.println("5. Ver kilometraje de la bicicleta");
	      System.out.println("6. Ver kilometraje del coche");
	      System.out.println("7. Ver kilometraje total");
	      System.out.println("8. Ver el numero de vehiculos creados");
	      System.out.println("9. Salir");
	      System.out.println("Elige una opci�n (1-9): ");
	      
	      opcion = sc.nextInt();
	      sc.nextLine();
	      
	      switch (opcion) {
	        case 1:
	          System.out.print("�Cu�ntos kil�metros quiere recorrer? ");
	          km = sc.nextInt();
	          sc.nextLine();
	          bhSpeedrom.recorre(km);
	          break;
	        case 2:
	          bhSpeedrom.hazCaballito();
	          break;
	        case 3:
	          System.out.print("�Cu�ntos kil�metros quiere recorrer? ");
	          km = sc.nextInt();
	          sc.nextLine();
	          saab93.recorre(km);
	          break;
	        case 4:
	          saab93.quemaRueda();
	          break;
	        case 5:
	          System.out.println("La bicicleta lleva recorridos ");
	          System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
	          break;
	        case 6:
	          System.out.println("El coche lleva recorridos ");
	          System.out.println(saab93.getKilometrosRecorridos() + " Km");
	          break;
	        case 7:
	          System.out.println("Los veh�culos llevan recorridos ");
	          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
	        case 8:
	          System.out.println("El n�mero de veh�culos creados es ");
	          System.out.println(Vehiculo.getVehiculosCreados());
	        default:
	      } // switch
	    } // while
	    
	    Bicicleta bike = new Bicicleta(19);
	    
	    
	}

}
