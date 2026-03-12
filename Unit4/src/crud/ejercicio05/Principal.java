package crud.ejercicio05;

import java.util.Scanner;

/**
 * Programa principal para la gestión de cuentas corrientes mediante menú CRUD.
 * La búsqueda de cuentas se realiza a través del DNI del titular.
 */
public class Principal {

	private static final Scanner sc = new Scanner(System.in);
	private static final GestionCuentas gestion = new GestionCuentas();

	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			opcion = leerEntero("Opción: ");
			procesarOpcion(opcion);
		} while (opcion != 7);
	}

	private static void mostrarMenu() {
		System.out.println("\nGESTIÓN DE CUENTAS CORRIENTES");
		System.out.println("==============================");
		System.out.println("1. Listado de cuentas");
		System.out.println("2. Abrir cuenta");
		System.out.println("3. Consultar cuenta (por DNI)");
		System.out.println("4. Modificar titular");
		System.out.println("5. Ingresar dinero");
		System.out.println("6. Sacar dinero");
		System.out.println("7. Cerrar cuenta");
		System.out.println("8. Salir");
	}

	private static void procesarOpcion(int opcion) {
		switch (opcion) {
		case 1 -> listarCuentas();
		case 2 -> abrirCuenta();
		case 3 -> consultarCuenta();
		case 4 -> modificarTitular();
		case 5 -> ingresarDinero();
		case 6 -> sacarDinero();
		case 7 -> cerrarCuenta();
		case 8 -> System.out.println("¡Hasta pronto!");
		default -> System.out.println("Opción no válida. Introduce un número del 1 al 8.");
		}
	}

	private static void listarCuentas() {
		System.out.println("\n-- Listado de Cuentas --");
		gestion.listar();
	}

	private static void abrirCuenta() {
		System.out.println("\n-- Abrir Nueva Cuenta --");
		String dni = leerTexto("DNI del titular: ");
		String nombre = leerTexto("Nombre del titular: ");
		double saldo = leerDouble("Saldo inicial: ");
		CuentaCorriente.Nacionalidad nacionalidad = leerNacionalidad();

		if (gestion.abrirCuenta(new CuentaCorriente(dni, nombre, saldo, nacionalidad))) {
			System.out.println("Cuenta abierta correctamente.");
		} else {
			System.out.println("Ya existe una cuenta con ese DNI.");
		}
	}

	private static void consultarCuenta() {
		System.out.println("\n-- Consultar Cuenta --");
		String dni = leerTexto("DNI del titular: ");
		CuentaCorriente cuenta = gestion.buscarPorDni(dni);
		if (cuenta != null) {
			System.out.println(cuenta);
		} else {
			System.out.println("No existe ninguna cuenta con ese DNI.");
		}
	}

	private static void modificarTitular() {
		System.out.println("\n-- Modificar Titular --");
		String dni = leerTexto("DNI del titular a modificar: ");
		CuentaCorriente cuenta = gestion.buscarPorDni(dni);
		if (cuenta == null) {
			System.out.println("No existe ninguna cuenta con ese DNI.");
			return;
		}
		System.out.println("Cuenta actual: " + cuenta);
		String nuevoNombre = leerTexto("Nuevo nombre (Enter para mantener): ");
		if (!nuevoNombre.isEmpty()) {
			cuenta.setNombre(nuevoNombre);
		}
		CuentaCorriente.Nacionalidad nuevaNacionalidad = leerNacionalidadOpcional();
		if (nuevaNacionalidad != null) {
			cuenta.setNacionalidad(nuevaNacionalidad);
		}
		System.out.println("Cuenta actualizada: " + cuenta);
	}

	private static void ingresarDinero() {
		System.out.println("\n-- Ingreso de Dinero --");
		String dni = leerTexto("DNI del titular: ");
		CuentaCorriente cuenta = gestion.buscarPorDni(dni);
		if (cuenta == null) {
			System.out.println("No existe ninguna cuenta con ese DNI.");
			return;
		}
		double cantidad = leerDouble("Cantidad a ingresar: ");
		if (cuenta.ingresarDinero(cantidad)) {
			System.out.println("Ingreso realizado. Saldo actual: " + cuenta.getSaldo() + "€");
		} else {
			System.out.println("La cantidad debe ser positiva.");
		}
	}

	private static void sacarDinero() {
		System.out.println("\n-- Retirada de Dinero --");
		String dni = leerTexto("DNI del titular: ");
		CuentaCorriente cuenta = gestion.buscarPorDni(dni);
		if (cuenta == null) {
			System.out.println("No existe ninguna cuenta con ese DNI.");
			return;
		}
		double cantidad = leerDouble("Cantidad a retirar: ");
		if (cuenta.sacarDinero(cantidad)) {
			System.out.println("Retirada realizada. Saldo actual: " + cuenta.getSaldo() + "€");
		} else {
			System.out.println("Saldo insuficiente. Saldo actual: " + cuenta.getSaldo() + "€");
		}
	}

	private static void cerrarCuenta() {
		System.out.println("\n-- Cerrar Cuenta --");
		String dni = leerTexto("DNI del titular: ");
		if (gestion.cerrarCuenta(dni)) {
			System.out.println("Cuenta cerrada correctamente.");
		} else {
			System.out.println("No existe ninguna cuenta con ese DNI.");
		}
	}

	private static CuentaCorriente.Nacionalidad leerNacionalidad() {
		System.out.println("Nacionalidad: 1) ESPAÑOLA  2) EXTRANJERA");
		int opcion = leerEntero("Opción: ");
		return opcion == 2 ? CuentaCorriente.Nacionalidad.EXTRANJERA : CuentaCorriente.Nacionalidad.ESPAÑOLA;
	}

	/**
	 * Pide la nacionalidad de forma opcional, devuelve null si el usuario pulsa
	 * Enter sin elegir nada.
	 */
	private static CuentaCorriente.Nacionalidad leerNacionalidadOpcional() {
		System.out.println("Nacionalidad: 1) ESPAÑOLA  2) EXTRANJERA  (Enter para mantener)");
		System.out.print("Opción: ");
		String entrada = sc.nextLine().trim();
		if (entrada.equals("1")) {
			return CuentaCorriente.Nacionalidad.ESPAÑOLA;
		} else if (entrada.equals("2")) {
			return CuentaCorriente.Nacionalidad.EXTRANJERA;
		}
		return null;
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
