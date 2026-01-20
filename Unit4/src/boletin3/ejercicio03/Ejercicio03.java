package boletin3.ejercicio03;

public class Ejercicio03 {

	static int sumaEnteros(int fin) {
		int suma = 0;

		for (int i = 1; i <= fin; i++) {
			suma += i;
		}

		return suma;
	}

	static int sumaEnteros(int inicio, int fin) {
		int suma = 0;

		for (int i = inicio; i <= fin; i++) {
			suma += i;
		}

		return suma;
	}

}
