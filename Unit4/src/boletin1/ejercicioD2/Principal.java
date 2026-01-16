package boletin1.ejercicioD2;

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
		System.out.println(p1.mayorEdad() ? p1.toString() + " mayor de edad" : p1.toString() + " menor de edad");
		System.out.println(p2.mayorEdad() ? p2.toString() + " mayor de edad" : p2.toString() + " menor de edad");
		// Mostramos si está jubilada la persona
		System.out.println(p1.jubilado() ? p1.getNombre() + " está jubilado" : " no está jubilado");
		System.out.println(p2.jubilado() ? p2.getNombre() + " está jubilado" : " no está jubilado");
		// Mostramos la diferencia de edad
		System.out.println(p1.diferenciaEdad(p2));

	}

}