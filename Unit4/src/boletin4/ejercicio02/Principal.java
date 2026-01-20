package boletin4.ejercicio02;

public class Principal {

	public static void main(String[] args) {

		Contador c1 = new Contador(1);

		System.out.println(c1.toString());
		c1.decrementar();
		System.out.println();
		System.out.println(c1.toString());
		c1.decrementar();
		System.out.println();
		System.out.println(c1.toString());
		c1.incrementar();
		System.out.println();
		System.out.println(c1.toString());

	}

}
