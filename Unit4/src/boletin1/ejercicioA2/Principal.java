package boletin1.ejercicioA2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Creo el scanner
		Scanner sc = new Scanner(System.in);
		// Creo dos objetos Persona
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		// Introduce los datos de las personas por teclado
		System.out.println("Introduce los datos de p1: ");
		p1.dni = sc.nextLine();
		p1.nombre = sc.nextLine();
		p1.apellidos = sc.nextLine();
		p1.edad = sc.nextInt();
		sc.nextLine(); // Limpiar memoria
		System.out.println("Introduce los datos de p2: ");
		p2.dni = sc.nextLine();
		p2.nombre = sc.nextLine();
		p2.apellidos = sc.nextLine();
		p2.edad = sc.nextInt();
		// Mostramos los datos de las personas
		System.out.println(p1.edad >= 18 ? p1.nombre + p1.apellidos + " con DNI " + p1.dni + " es mayor de edad"
				: p1.nombre + p1.apellidos + " con DNI " + p1.dni + " no es mayor de edad");
		System.out.println(p2.edad >= 18 ? p2.nombre + p2.apellidos + " con DNI " + p2.dni + " es mayor de edad"
				: p2.nombre + p2.apellidos + " con DNI " + p2.dni + " no es mayor de edad");

	}

}
