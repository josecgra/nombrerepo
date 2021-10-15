package es.ejerobj;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String fechaNacimiento;
	private String ciudad;
	private boolean trabajando;
	private boolean estudiando;
	
	// Constructor con TODOS los parametros
	public Persona(String nombre, String apellidos, int edad, String fechaNacimiento, String ciudad, String trabaja, String estudia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudad = ciudad;
		
		if (trabaja.equals("SI"))
			this.trabajando = true;
		else
			this.trabajando = false;
		
		if (estudia.equals("SI"))
			this.estudiando = true;
		else
			this.estudiando = false;
	}
	
		
	
	// accesos y modificaciones de cada propiedad
	// accesos GETter
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public boolean getTrabajando() {
		return trabajando;
	}
	
	public boolean getEstudiando() {
		return estudiando;
	}
	
	
	
	// modificaciones Setter
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setTrabajando(String trabaja) {
		if (trabaja.equals("SI"))
			this.trabajando = true;
		else
			this.trabajando = false;
	}
	
	public void setEstudiando(String estudia) {
		if (estudia.equals("SI"))
			this.estudiando = true;
		else
			this.estudiando = false;
	}
	
	
	
}
