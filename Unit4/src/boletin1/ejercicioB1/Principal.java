package boletin1.ejercicioB1;

public class Principal {

	public static void main(String[] args) {
		// Creo los objetos punto
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);
		// Muestro las coordenadas
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		System.out.println("(" + p2.x + ", " + p2.y + ")");
		System.out.println("(" + p3.x + ", " + p3.y + ")");
		// Modificamos las coordenadas
		p1.x += 3;
		p1.y -= 2;
		p2.x *= 3;
		p2.y /= 2;
		p3.x += 3;
		p3.y -= 2;
		// Muestro las coordenadas modificadas
		System.out.println();
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		System.out.println("(" + p2.x + ", " + p2.y + ")");
		System.out.println("(" + p3.x + ", " + p3.y + ")");
	}

}
