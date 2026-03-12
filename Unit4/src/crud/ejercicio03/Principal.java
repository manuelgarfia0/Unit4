package crud.ejercicio03;

import java.util.Scanner;

/**
 * Programa principal para registrar y gestionar los pedidos de pizza del día.
 */
public class Principal {

	private static final Scanner sc = new Scanner(System.in);
	private static final Pizzeria pizzeria = new Pizzeria();

	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			opcion = leerEntero("Opción: ");
			procesarOpcion(opcion);
		} while (opcion != 4);
	}

	private static void mostrarMenu() {
		System.out.println("\nPIZZERÍA - Pedidos del día");
		System.out.println("===========================");
		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
	}

	private static void procesarOpcion(int opcion) {
		switch (opcion) {
		case 1 -> listarPedidos();
		case 2 -> nuevoPedido();
		case 3 -> pizzaServida();
		case 4 -> System.out.println("¡Hasta pronto!");
		default -> System.out.println("Opción no válida. Introduce un número del 1 al 4.");
		}
	}

	private static void listarPedidos() {
		System.out.println("\n-- Pedidos del Día --");
		pizzeria.listar();
	}

	private static void nuevoPedido() {
		System.out.println("\n-- Nuevo Pedido --");
		int codigo = leerEntero("Código del pedido: ");
		Pizza.Tamano tamano = leerTamano();
		Pizza.Tipo tipo = leerTipo();
		pizzeria.nuevoPedido(new Pizza(codigo, tamano, tipo));
		System.out.println("Pedido registrado: " + codigo + " - " + tamano + " - " + tipo);
	}

	private static void pizzaServida() {
		System.out.println("\n-- Marcar Pizza como Servida --");
		int codigo = leerEntero("Código del pedido servido: ");
		if (pizzeria.marcarServida(codigo)) {
			System.out.println("Pizza marcada como servida.");
		} else {
			System.out.println("No se encontró ningún pedido pendiente con ese código.");
		}
	}

	private static Pizza.Tamano leerTamano() {
		System.out.println("Tamano: 1) MEDIANA  2) FAMILIAR");
		int opcion = leerEntero("Opción tamano: ");
		return opcion == 2 ? Pizza.Tamano.FAMILIAR : Pizza.Tamano.MEDIANA;
	}

	private static Pizza.Tipo leerTipo() {
		System.out.println("Tipo: 1) MARGARITA  2) CUATRO_QUESOS  3) FUNGHI");
		int opcion = leerEntero("Opción tipo: ");
		return switch (opcion) {
		case 2 -> Pizza.Tipo.CUATRO_QUESOS;
		case 3 -> Pizza.Tipo.FUNGHI;
		default -> Pizza.Tipo.MARGARITA;
		};
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
