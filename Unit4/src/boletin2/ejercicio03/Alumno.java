package boletin2.ejercicio03;

public class Alumno {
	/**
	 * Atributo nombre del alumno
	 */
	private String nombre;
	/**
	 * Atributo notaMedia del alumno
	 */
	private double notaMedia;

	/**
	 * Constructor del alumno
	 * 
	 * @param nombre    Nombre del alumno
	 * @param notaMedia Nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	@Override
	/**
	 * Método equals para comprobar que dos alumnos son iguales si tiene el mismo
	 * nombre
	 */
	public boolean equals(Object obj) {
		boolean iguales = false;
		Alumno otroAlumno = (Alumno) obj;
		if (this.nombre.equals(otroAlumno.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	/**
	 * Método toString para mostrar la información del alumno
	 */
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
}
