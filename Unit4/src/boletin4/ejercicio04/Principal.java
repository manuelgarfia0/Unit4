package boletin4.ejercicio04;

public class Principal {

	public static void main(String[] args) {
		Fraccion f1 = new Fraccion(2, 3);
		Fraccion f2 = new Fraccion(3, 4);

		System.out.println("Suma: " + f1.suma(f2));
		System.out.println("Resta: " + f1.resta(f2));
		System.out.println("Multiplica: " + f1.multiplica(f2));
		System.out.println("Divide: " + f1.divide(f2));
	}

}
