package es.otraclase;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	
	// implicitamente tengo definido el constructor por defecto Persona()
	public Persona() {
		this.nombre = "Fulanito";
		this.apellidos = "De tal";
		this.edad = 18;
		this.altura = 180;
	}
	
	
	// crear los metodos de get y set (getter y setter)

	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	// crear un método que devuelva nombre y los apellidos concatenados
	public String getNombreApellidos() {
		return this.getNombre() + " " + this.getApellidos();
	}
	
	// crear un método que me diga si una persona es mayor de edad o no.
	public boolean esMayorEdad() {
		
		if (this.getEdad() < 18)
			return false;
		else
			return true;
	
	}
	
	
	
}
