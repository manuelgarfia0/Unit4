package boletin1.ejercicioC1;

public class Principal {

	public static void main(String[] args) {
		// Creo los objetos punto
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);
		// Muestro las coordenadas
		System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("(" + p3.getX() + ", " + p3.getY() + ")");
		// Modificamos las coordenadas
		p1.setX(8);
		p1.setY(4);
		p2.setX(14);
		p2.setY(12);
		p3.setX(5);
		p3.setY(5);
		// Muestro las coordenadas modificadas
		System.out.println();
		System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("(" + p3.getX() + ", " + p3.getY() + ")");
	}

}
