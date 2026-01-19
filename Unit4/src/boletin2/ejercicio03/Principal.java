package boletin2.ejercicio03;

public class Principal {

	public static void main(String[] args) {

		Alumno a1 = new Alumno("Antonio", 7.45);
		Alumno a2 = new Alumno("Antonio", 8.93);
		Alumno a3 = new Alumno("Federico", 5.67);

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());

		System.out.println();

		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a2));

	}

}
