package boletin1.ejercicioC2;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	public Persona(String dni, String nombre, String apellidos, int edad) {
		if (!dni.isBlank()) {
			this.dni = dni;
		}
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (!apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		if (edad >= 0) {
			this.edad = edad;
		}

	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

}