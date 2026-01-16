package boletin1.ejercicioD3;

public class Principal {

	public static void main(String[] args) {
		// Creo los rectangulos
		Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo r2 = new Rectangulo(7, 9, 2, 3);
		// Muestro las coordenadas
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		// Calculo el perímetro y el área de r1
		System.out.println("Perímetro: " + r1.getPerimetro());
		System.out.println("Área: " + r1.getArea());
		// Calculo el perímetro y el área de r2
		System.out.println("Perímetro: " + r2.getPerimetro());
		System.out.println("Área: " + r2.getArea());
		// Modifico las coordenadas
		r1.setX1(5);
		r1.setY1(5);
		r1.setX2(10);
		r1.setY2(10);
		r2.setX1(10);
		r2.setY1(12);
		r2.setX2(5);
		r2.setY2(6);
		// Vuelvo a mostrar toda la información
		System.out.println();
		// Muestro las coordenadas
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		// Calculo el perímetro y el área de r1
		System.out.println("Perímetro: " + r1.getPerimetro());
		System.out.println("Área: " + r1.getArea());
		// Calculo el perímetro y el área de r2
		System.out.println("Perímetro: " + r2.getPerimetro());
		System.out.println("Área: " + r2.getArea());
	}

}