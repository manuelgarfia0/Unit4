package boletin4.ejercicio01;

public class Principal {

	public static void main(String[] args) {
		Hora h1 = new Hora(23, 59, 59);
		System.out.println(h1.toString());

		h1.incrementarSegundo();
		System.out.println();

		System.out.println(h1.toString());

		h1.incrementarHora();
		h1.incrementarMinuto();
		System.out.println();

		System.out.println(h1.toString());
	}

}
