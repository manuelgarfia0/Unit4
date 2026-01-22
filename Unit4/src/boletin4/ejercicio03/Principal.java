package boletin4.ejercicio03;

public class Principal {

	public static void main(String[] args) {

		Fecha f1 = new Fecha(5, 5, 2024);
		System.out.println("Fecha f1: " + f1.toString());
		System.out.println("¿Es bisiesto? " + f1.esBisiesto());
		System.out.println("¿Fecha correcta? " + f1.fechaCorrecta());
		f1.diaSiguiente();
		System.out.println("Día siguiente: " + f1.toString());
		System.out.println();

		Fecha f2 = new Fecha(29, 2, 2024);
		System.out.println("Fecha f2: " + f2.toString());
		System.out.println("¿Es bisiesto? " + f2.esBisiesto());
		System.out.println("¿Fecha correcta? " + f2.fechaCorrecta());
		f2.diaSiguiente();
		System.out.println("Día siguiente: " + f2.toString());
		System.out.println();

		Fecha f3 = new Fecha(29, 2, 2023);
		System.out.println("Fecha f3: " + f3.toString());
		System.out.println("¿Es bisiesto? " + f3.esBisiesto());
		System.out.println("¿Fecha correcta? " + f3.fechaCorrecta());
		System.out.println();

		Fecha f4 = new Fecha(31, 12, 2024);
		System.out.println("Fecha f4: " + f4.toString());
		System.out.println("¿Es bisiesto? " + f4.esBisiesto());
		System.out.println("¿Fecha correcta? " + f4.fechaCorrecta());
		f4.diaSiguiente();
		System.out.println("Día siguiente: " + f4.toString());
		System.out.println();

		Fecha f5 = new Fecha(31, 4, 2023);
		System.out.println("Fecha f5: " + f5.toString());
		System.out.println("¿Fecha correcta? " + f5.fechaCorrecta());
	}
}