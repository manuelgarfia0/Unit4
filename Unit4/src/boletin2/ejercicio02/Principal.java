package boletin2.ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// Crear algunos libros
		Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 10, 0, Libro.Genero.NARRATIVO);
		Libro libro2 = new Libro("1984", "George Orwell", 2, 2, Libro.Genero.DIDACTICO);

		// Mostrar información de los libros
		System.out.println(libro1);
		System.out.println(libro2);

		System.out.println();

		// Realizar préstamos
		System.out.println("Préstamo de libro1: " + libro1.prestamo());
		System.out.println("Préstamo de libro2: " + libro2.prestamo());

		System.out.println();

		// Mostrar información después de los préstamos
		System.out.println(libro1);
		System.out.println(libro2);

		System.out.println();

		// Realizar devoluciones
		System.out.println("Devolución de libro1: " + libro1.devolucion());
		System.out.println("Devolución de libro2: " + libro2.devolucion());

		System.out.println();

		// Mostrar información después de las devoluciones
		System.out.println(libro1);
		System.out.println(libro2);

		System.out.println();

		// Comparar libros
		System.out.println("¿Son iguales libro1 y libro2? " + libro1.equals(libro2));
	}
}