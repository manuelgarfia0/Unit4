package boletin2.ejercicio04;

public class Principal {

	public static void main(String[] args) {

		Pizza p1 = new Pizza(1234, Pizza.Tamaño.MEDIANA, Pizza.Tipo.MARGARITA);
		Pizza p2 = new Pizza(1234, Pizza.Tamaño.FAMILIAR, Pizza.Tipo.CUATRO_QUESOS);
		Pizza p3 = new Pizza(1342, Pizza.Tamaño.MEDIANA, Pizza.Tipo.FUNGHI);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		p1.setEstado(Pizza.Estado.SERVIDA);
		p2.setEstado(Pizza.Estado.SERVIDA);
		p3.setEstado(Pizza.Estado.SERVIDA);

		System.out.println();

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		System.out.println();

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}
}