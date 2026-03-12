package crud.ejercicio02;

import java.util.Scanner;

/**
 * GESTISIMAL - GESTIón SIMplificada de ALmacén. Programa principal para
 * gestionar el inventario mediante menú CRUD.
 */
public class Principal {

	private static final Scanner sc = new Scanner(System.in);
	private static final Almacen almacen = new Almacen();

	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			opcion = leerEntero("Opción: ");
			procesarOpcion(opcion);
		} while (opcion != 7);
	}

	private static void mostrarMenu() {
		System.out.println("\nGESTISIMAL - Gestión de Almacén");
		System.out.println("=================================");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
	}

	private static void procesarOpcion(int opcion) {
		switch (opcion) {
		case 1 -> listarArticulos();
		case 2 -> altaArticulo();
		case 3 -> bajaArticulo();
		case 4 -> modificarArticulo();
		case 5 -> entradaMercancia();
		case 6 -> salidaMercancia();
		case 7 -> System.out.println("¡Hasta pronto!");
		default -> System.out.println("Opción no válida. Introduce un número del 1 al 7.");
		}
	}

	private static void listarArticulos() {
		System.out.println("\n-- Inventario --");
		almacen.listar();
	}

	private static void altaArticulo() {
		System.out.println("\n-- Alta de Artículo --");
		String codigo = leerTexto("Código: ");
		String nombre = leerTexto("Nombre: ");
		double precio = leerDouble("Precio sin IVA: ");
		int iva = leerEntero("IVA (%): ");
		int stock = leerEntero("Stock inicial: ");

		if (almacen.alta(new Articulo(codigo, nombre, precio, iva, stock))) {
			System.out.println("Artículo dado de alta correctamente.");
		} else {
			System.out.println("Ya existe un artículo con ese código.");
		}
	}

	private static void bajaArticulo() {
		System.out.println("\n-- Baja de Artículo --");
		String codigo = leerTexto("Código del artículo a dar de baja: ");
		if (almacen.baja(codigo)) {
			System.out.println("Artículo eliminado correctamente.");
		} else {
			System.out.println("Artículo no encontrado.");
		}
	}

	private static void modificarArticulo() {
		System.out.println("\n-- Modificación de Artículo --");
		String codigo = leerTexto("Código del artículo a modificar: ");
		Articulo articulo = almacen.buscarPorCodigo(codigo);
		if (articulo == null) {
			System.out.println("Artículo no encontrado.");
			return;
		}
		System.out.println("Artículo actual: " + articulo);
		String nombre = leerTexto("Nuevo nombre (Enter para mantener): ");
		if (!nombre.isEmpty()) {
			articulo.setNombre(nombre);
		}
		String sPrecio = leerTexto("Nuevo precio (Enter para mantener): ");
		if (!sPrecio.isEmpty()) {
			articulo.setPrecio(Double.parseDouble(sPrecio.replace(",", ".")));
		}
		String sIva = leerTexto("Nuevo IVA (Enter para mantener): ");
		if (!sIva.isEmpty()) {
			articulo.setIva(Integer.parseInt(sIva));
		}
		System.out.println("Artículo modificado: " + articulo);
	}

	private static void entradaMercancia() {
		System.out.println("\n-- Entrada de Mercancía --");
		String codigo = leerTexto("Código del artículo: ");
		Articulo articulo = almacen.buscarPorCodigo(codigo);
		if (articulo == null) {
			System.out.println("Artículo no encontrado.");
			return;
		}
		int cantidad = leerEntero("Cantidad a añadir: ");
		if (articulo.almacenar(cantidad)) {
			System.out.println("Stock actualizado. Stock actual: " + articulo.getCuantosQuedan());
		} else {
			System.out.println("La cantidad debe ser positiva.");
		}
	}

	private static void salidaMercancia() {
		System.out.println("\n-- Salida de Mercancía --");
		String codigo = leerTexto("Código del artículo: ");
		Articulo articulo = almacen.buscarPorCodigo(codigo);
		if (articulo == null) {
			System.out.println("Artículo no encontrado.");
			return;
		}
		int cantidad = leerEntero("Cantidad a retirar: ");
		if (articulo.vender(cantidad)) {
			System.out.println("Stock actualizado. Stock actual: " + articulo.getCuantosQuedan());
		} else {
			System.out.println("No hay suficiente stock. Stock actual: " + articulo.getCuantosQuedan());
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
