package crud.ejercicio04;

import java.util.Scanner;

/**
 * Programa principal para gestionar una colección de discos mediante menú CRUD.
 */
public class Principal {

	private static final Scanner sc = new Scanner(System.in);
	private static final Coleccion coleccion = new Coleccion();

	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			opcion = leerEntero("Opción: ");
			procesarOpcion(opcion);
		} while (opcion != 4);
	}

	private static void mostrarMenu() {
		System.out.println("\nCOLECCIÓN DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Disco.");
		System.out.println("3. Borrar.");
		System.out.println("4. Salir.");
	}

	private static void procesarOpcion(int opcion) {
		switch (opcion) {
		case 1 -> listarDiscos();
		case 2 -> nuevoDisco();
		case 3 -> borrarDisco();
		case 4 -> System.out.println("¡Hasta pronto!");
		default -> System.out.println("Opción no válida. Introduce un número del 1 al 4.");
		}
	}

	private static void listarDiscos() {
		System.out.println("\n-- Colección de Discos --");
		coleccion.listar();
	}

	private static void nuevoDisco() {
		System.out.println("\n-- Nuevo Disco --");
		String codigo = leerTexto("Código: ");
		String autor = leerTexto("Autor: ");
		String titulo = leerTexto("Título: ");
		int duracion = leerEntero("Duración (segundos): ");
		Disco.Genero genero = leerGenero();

		if (coleccion.aniadir(new Disco(codigo, autor, titulo, duracion, genero))) {
			System.out.println("Disco añadido a la colección.");
		} else {
			System.out.println("Ya existe un disco con ese código.");
		}
	}

	private static void borrarDisco() {
		System.out.println("\n-- Borrar Disco --");
		String codigo = leerTexto("Código del disco a borrar: ");
		if (coleccion.eliminar(codigo)) {
			System.out.println("Disco eliminado de la colección.");
		} else {
			System.out.println("Disco no encontrado.");
		}
	}

	private static Disco.Genero leerGenero() {
		System.out.println("Género: 1) ROCK  2) POP  3) JAZZ  4) BLUES");
		int opcion = leerEntero("Opción género: ");
		return switch (opcion) {
		case 1 -> Disco.Genero.ROCK;
		case 2 -> Disco.Genero.POP;
		case 3 -> Disco.Genero.JAZZ;
		default -> Disco.Genero.BLUES;
		};
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
}
