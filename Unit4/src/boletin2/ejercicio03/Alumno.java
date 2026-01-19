package boletin2.ejercicio03;

public class Alumno {

	private String nombre;
	private double notaMedia;

	public Alumno(String nombre, double notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Alumno otroAlumno = (Alumno) obj;
		if (this.nombre.equals(otroAlumno.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
}
