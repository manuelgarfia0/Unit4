package boletin4.ejercicio04;

public class Fraccion {

	private int numerador;
	private int denominador = 1;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		if (denominador > 0) {
			this.denominador = denominador;
		}

	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public Fraccion suma(Fraccion otra) {
		int num = this.numerador * otra.denominador + otra.numerador * this.denominador;
		int den = this.denominador * otra.denominador;
		return new Fraccion(num, den);
	}

	public Fraccion resta(Fraccion otra) {
		int num = this.numerador * otra.denominador - otra.numerador * this.denominador;
		int den = this.denominador * otra.denominador;
		return new Fraccion(num, den);
	}

	public Fraccion multiplica(Fraccion otra) {
		int num = this.numerador * otra.numerador;
		int den = this.denominador * otra.denominador;
		return new Fraccion(num, den);
	}

	public Fraccion divide(Fraccion otra) {
		if (otra.numerador == 0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}
		int num = this.numerador * otra.denominador;
		int den = this.denominador * otra.numerador;
		return new Fraccion(num, den);
	}

	private int mcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	public void simplifica() {
		int mcd = mcd(Math.abs(numerador), Math.abs(denominador));
		numerador /= mcd;
		denominador /= mcd;
		if (denominador < 0) {
			numerador = -numerador;
			denominador = -denominador;
		}
	}

	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}

}
