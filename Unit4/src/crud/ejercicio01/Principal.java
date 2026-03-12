package crud.ejercicio01;

import java.util.Scanner;

/**
 * Programa principal para la gestión de alumnos mediante un menú CRUD.
 */
public class Principal {

	private static final Scanner sc = new Scanner(System.in);
	private static final ListaAlumnos listaAlumnos = new ListaAlumnos();

	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			opcion = leerEntero("Opción: ");
			procesarOpcion(opcion);
		} while (opcion != 5);
	}

	private static void mostrarMenu() {
		System.out.println("\nALUMNOS/AS");
		System.out.println("===================");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.");
	}

	private static void procesarOpcion(int opcion) {
		switch (opcion) {
		case 1 -> listarAlumnos();
		case 2 -> nuevoAlumno();
		case 3 -> modificarAlumno();
		case 4 -> borrarAlumno();
		case 5 -> System.out.println("¡Hasta pronto!");
		default -> System.out.println("Opción no válida. Introduce un número del 1 al 5.");
		}
	}

	private static void listarAlumnos() {
		System.out.println("\n-- Listado de Alumnos --");
		listaAlumnos.listar();
	}

	private static void nuevoAlumno() {
		System.out.println("\n-- Nuevo Alumno --");
		String nombre = leerTexto("Nombre: ");
		double notaMedia = leerDouble("Nota media (0-10): ");
		listaAlumnos.aniadir(new Alumno(nombre, notaMedia));
		System.out.println("Alumno añadido correctamente.");
	}

	private static void modificarAlumno() {
		System.out.println("\n-- Modificar Alumno --");
		String nombre = leerTexto("Nombre del alumno a modificar: ");
		Alumno alumno = listaAlumnos.buscarPorNombre(nombre);
		if (alumno == null) {
			System.out.println("Alumno no encontrado.");
			return;
		}
		System.out.println("Alumno encontrado: " + alumno);
		double nuevaNota = leerDouble("Nueva nota media (0-10): ");
		listaAlumnos.modificarNota(nombre, nuevaNota);
		System.out.println("Nota modificada correctamente.");
	}

	private static void borrarAlumno() {
		System.out.println("\n-- Borrar Alumno --");
		String nombre = leerTexto("Nombre del alumno a borrar: ");
		if (listaAlumnos.eliminar(nombre)) {
			System.out.println("Alumno eliminado correctamente.");
		} else {
			System.out.println("Alumno no encontrado.");
		}
	}

	private static String leerTexto(String mensaje) {
		System.out.print(mensaje);
		return sc.nextLine().trim();
	}

	private static int leerEntero(String mensaje) {
		System.out.print(mensaje);
		try {
			return Integer.parseInt(sc.nextLine().trim());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	private static double leerDouble(String mensaje) {
		while (true) {
			System.out.print(mensaje);
			try {
				return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
			} catch (NumberFormatException e) {
				System.out.println("Valor no válido. Introduce un número.");
			}
		}
	}
}
