package boletin1.ejercicioC3;

public class Principal {

	public static void main(String[] args) {
		// Declaro las variables
		int perimetro;
		int ancho;
		int alto;
		double area;
		// Creo los rectangulos
		Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo r2 = new Rectangulo(7, 9, 2, 3);
		// Muestro las coordenadas
		System.out.println("(" + r1.getX1() + ", " + r1.getY1() + "), (" + r1.getX2() + ", " + r1.getY2() + ")");
		System.out.println("(" + r2.getX1() + ", " + r2.getY1() + "), (" + r2.getX2() + ", " + r2.getY2() + ")");
		// Calculo el perímetro y el área de r1
		ancho = Math.abs(r1.getX2() - r1.getX1());
		alto = Math.abs(r1.getY2() - r1.getY1());
		perimetro = 2 * (alto + ancho);
		area = ancho * alto;
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		// Calculo el perímetro y el área de r2
		ancho = Math.abs(r2.getX2() - r2.getX1());
		alto = Math.abs(r2.getY2() - r2.getY1());
		perimetro = 2 * (alto + ancho);
		area = ancho * alto;
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
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
		System.out.println("(" + r1.getX1() + ", " + r1.getY1() + "), (" + r1.getX2() + ", " + r1.getY2() + ")");
		System.out.println("(" + r2.getX1() + ", " + r2.getY1() + "), (" + r2.getX2() + ", " + r2.getY2() + ")");
		// Calculo el perímetro y el área de r1
		ancho = Math.abs(r1.getX2() - r1.getX1());
		alto = Math.abs(r1.getY2() - r1.getY1());
		perimetro = 2 * (alto + ancho);
		area = ancho * alto;
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		// Calculo el perímetro y el área de r2
		ancho = Math.abs(r2.getX2() - r2.getX1());
		alto = Math.abs(r2.getY2() - r2.getY1());
		perimetro = 2 * (alto + ancho);
		area = ancho * alto;
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
	}

}