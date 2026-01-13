package boletin1.ejercicioB3;

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
		System.out.println("(" + r1.x1 + ", " + r1.y1 + "), (" + r1.x2 + ", " + r1.y2 + ")");
		System.out.println("(" + r2.x1 + ", " + r2.y1 + "), (" + r2.x2 + ", " + r2.y2 + ")");
		// Calculo el perímetro y el área de r1
		ancho = Math.abs(r1.x2 - r1.x1);
		alto = Math.abs(r1.y2 - r1.y1);
		perimetro = 2 * (alto + ancho);
		area = ancho * alto;
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		// Calculo el perímetro y el área de r2
		ancho = Math.abs(r2.x2 - r2.x1);
		alto = Math.abs(r2.y2 - r2.y1);
		perimetro = 2 * (alto + ancho);
		area = ancho * alto;
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		// Modifico las coordenadas
		r1.x1 += 0;
		r1.y1 += 0;
		r1.x2 += 5;
		r1.y2 += 5;
		r2.x1 += 7;
		r2.y1 += 9;
		r2.x2 += 2;
		r2.y2 += 3;
		// Vuelvo a mostrar toda la información
		System.out.println();
		// Muestro las coordenadas
		System.out.println("(" + r1.x1 + ", " + r1.y1 + "), (" + r1.x2 + ", " + r1.y2 + ")");
		System.out.println("(" + r2.x1 + ", " + r2.y1 + "), (" + r2.x2 + ", " + r2.y2 + ")");
		// Calculo el perímetro y el área de r1
		ancho = Math.abs(r1.x2 - r1.x1);
		alto = Math.abs(r1.y2 - r1.y1);
		perimetro = 2 * (alto + ancho);
		area = ancho * alto;
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		// Calculo el perímetro y el área de r2
		ancho = Math.abs(r2.x2 - r2.x1);
		alto = Math.abs(r2.y2 - r2.y1);
		perimetro = 2 * (alto + ancho);
		area = ancho * alto;
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
	}

}