package boletin3.ejercicio04;

public class Ejercicio04 {

	static boolean parseToBoolean(int num) {
		boolean trueFalse = false;

		if (num == 0) {
			trueFalse = false;
		} else if (num == 1) {
			trueFalse = true;
		}

		return trueFalse;
	}

	static boolean parseToBoolean(String palabra) {
		boolean trueFalse = false;

		if (palabra.equalsIgnoreCase("false")) {
			trueFalse = false;
		} else if (palabra.equalsIgnoreCase("true")) {
			trueFalse = true;
		}
		return trueFalse;
	}

}
