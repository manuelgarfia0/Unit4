package boletin3.ejercicio06;

public class FuncionesMatematicas {

	static int sumatorio(int fin) {
		int suma = 0;

		for (int i = 1; i <= fin; i++) {
			suma += i;
		}

		return suma;
	}

	static double potencia(double a, int n) {
		double potencia = 0;

		potencia = Math.pow(a, n);

		return potencia;
	}

	static int serieFibonacci(int numero) {
		int res = 0;

		if (numero == 0) {
			res = 1;
		} else if (numero == 1) {
			res = 1;
		} else {
			res = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}

		return res;
	}

}
