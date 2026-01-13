package boletin1.ejercicioB2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Creo el scanner
		Scanner sc = new Scanner(System.in);
		Persona p1;
		Persona p2;
		// Declarar variables
		String dni;
		String nombre;
		String apellidos;
		int edad;
		// Introduce los datos de p1
		System.out.println("Introduce los datos de p1: ");
		dni = sc.nextLine();
		nombre = sc.nextLine();
		apellidos = sc.nextLine();
		edad = sc.nextInt();
		sc.nextLine(); // Limpiar memoria
		// Asigno las variables
		p1 = new Persona(dni, nombre, apellidos, edad);
		// Introduzco los datos de p2
		System.out.println("Introduce los datos de p2: ");
		dni = sc.nextLine();
		nombre = sc.nextLine();
		apellidos = sc.nextLine();
		edad = sc.nextInt();
		sc.nextLine(); // Limpiar memoria
		// Asigno las variables
		p2 = new Persona(dni, nombre, apellidos, edad);
		// Mostramos los datos de las personas
		System.out.println(p1.edad >= 18 ? p1.nombre + p1.apellidos + " con DNI " + p1.dni + " es mayor de edad"
				: p1.nombre + p1.apellidos + " con DNI " + p1.dni + " no es mayor de edad");
		System.out.println(p2.edad >= 18 ? p2.nombre + p2.apellidos + " con DNI " + p2.dni + " es mayor de edad"
				: p2.nombre + p2.apellidos + " con DNI " + p2.dni + " no es mayor de edad");

	}

}