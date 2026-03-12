package crud.ejercicio01;

/**
 * Clase que representa a un alumno con nombre y nota media.
 * Adaptada de boletin2.ejercicio03.Alumno añadiendo getters y setters
 * necesarios para el CRUD.
 */
public class Alumno {

	private String nombre;
	private double notaMedia;

	/**
	 * Constructor del alumno.
	 *
	 * @param nombre    Nombre del alumno
	 * @param notaMedia Nota media del alumno (0-10)
	 */
	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		setNotaMedia(notaMedia);
	}

	public String getNombre() {
		return nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Establece la nota media validando que esté en el rango [0, 10].
	 *
	 * @param notaMedia Nueva nota media
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Alumno otroAlumno = (Alumno) obj;
		if (this.nombre.equalsIgnoreCase(otroAlumno.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
}
