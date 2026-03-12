package crud.ejercicio01;

import java.util.ArrayList;

/**
 * Clase que gestiona la colección de alumnos de una clase.
 * Centraliza todas las operaciones CRUD sobre el ArrayList.
 */
public class ListaAlumnos {

	private ArrayList<Alumno> alumnos;

	public ListaAlumnos() {
		alumnos = new ArrayList<>();
	}

	/**
	 * Añade un alumno a la colección.
	 *
	 * @param alumno Alumno a añadir
	 */
	public void aniadir(Alumno alumno) {
		alumnos.add(alumno);
	}

	/**
	 * Busca un alumno por nombre (insensible a mayúsculas).
	 *
	 * @param nombre Nombre del alumno a buscar
	 * @return El alumno encontrado, o null si no existe
	 */
	public Alumno buscarPorNombre(String nombre) {
		Alumno encontrado = null;
		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = alumno;
			}
		}
		return encontrado;
	}

	/**
	 * Modifica la nota media de un alumno buscado por nombre.
	 *
	 * @param nombre   Nombre del alumno a modificar
	 * @param nuevaNota Nueva nota media
	 * @return true si se encontró y modificó, false si no existe
	 */
	public boolean modificarNota(String nombre, double nuevaNota) {
		Alumno alumno = buscarPorNombre(nombre);
		boolean modificado = alumno != null;
		if (modificado) {
			alumno.setNotaMedia(nuevaNota);
		}
		return modificado;
	}

	/**
	 * Elimina un alumno de la colección buscándolo por nombre.
	 *
	 * @param nombre Nombre del alumno a eliminar
	 * @return true si se encontró y eliminó, false si no existe
	 */
	public boolean eliminar(String nombre) {
		Alumno alumno = buscarPorNombre(nombre);
		boolean eliminado = alumno != null;
		if (eliminado) {
			alumnos.remove(alumno);
		}
		return eliminado;
	}

	/**
	 * Imprime el listado completo de alumnos, uno por línea.
	 */
	public void listar() {
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos registrados.");
		} else {
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
		}
	}
}
