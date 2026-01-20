package boletin3.ejercicio05;

import java.util.Random;

public class Ejercicio05 {

	static Random rd = new Random();

	static void numerosAleatorios(int cantidad) {

		for (int i = 0; i < cantidad; i++) {
			System.out.print(rd.nextInt(0, 2) + " ");
		}
	}

	static void numerosAleatorios(int cantidad, int max) {
		for (int i = 0; i < cantidad; i++) {
			System.out.print(rd.nextInt(0, max + 1) + " ");
		}
	}

	static void numerosAleatorios(int cantidad, int min, int max) {
		for (int i = 0; i < cantidad; i++) {
			System.out.print(rd.nextInt(min, max + 1) + " ");
		}
	}

}
