package es.vehiculos;

public class Vehiculo {
	 // atributos de clase
	  private static int kilometrosTotales = 0;
	  private static int vehiculosCreados = 0;
	  
	  // atributos de instancia
	  private int kilometrosRecorridos;
	  
	  public Vehiculo() {
	    this.kilometrosRecorridos = 0;
	    this.vehiculosCreados++;
	  }

	  public int getKilometrosRecorridos() {
	    return this.kilometrosRecorridos;
	  }
	  
	  public static int getKilometrosTotales() {
	    return Vehiculo.kilometrosTotales;
	  }
	  
	  public static int getVehiculosCreados() {
		  return Vehiculo.vehiculosCreados;
	  }

	  /**
	   * Hace que un veh�culo recorra una distancia determinada.
	   * <p>
	   * Cuando un veh�culo recorre una distancia <code>k</code>, se
	   * incrementan su propio cuentakil�metros, es decir, su atributo
	   * <code>kilometrosRecorridos</code> y tambi�n se incrementa la cuenta
	   * global de kil�metros que recorren todos los veh�culos, es decir, el
	   * atributo de clase <code>kilometrosTotales</code>.
	   *
	   * @param k kil�metros a recorrer
	   */
	  public void recorre(int k) {
	    this.kilometrosRecorridos += k;
	    Vehiculo.kilometrosTotales += k;
	  }

	@Override
	public String toString() {
		return "Vehiculo [kilometrosRecorridos=" + kilometrosRecorridos + "]";
	}
	  
	  
	  
}
