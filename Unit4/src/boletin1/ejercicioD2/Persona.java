package boletin1.ejercicioD2;

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

	public void setNombre(String nombre) {
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if (!apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	public boolean mayorEdad() {
		boolean mayor = true;

		if (this.edad < 18) {
			mayor = false;
		}

		return mayor;
	}

	public boolean jubilado() {
		boolean jubilado = true;

		if (this.edad < 65) {
			jubilado = false;
		}

		return jubilado;
	}

	public int diferenciaEdad(Persona p) {
		int diferencia = 0;
		// Valor absoluto para que no importe cual es mayor
		diferencia = Math.abs(this.edad - p.edad);

		return diferencia;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

}