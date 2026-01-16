package boletin1.ejercicioD1;

public class Principal {

	public static void main(String[] args) {
		// Creo los objetos punto
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);
		// Muestro las coordenadas
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		// Muestro la distancia entre dos puntos
		System.out.println("Distancia entre p1 y p2: " + p1.distancia(p2));
		// Modificamos las coordenadas
		p1.setXY(8, 4);
		p2.setXY(14, 12);
		p3.setXY(5, 5);
		// Muestro las coordenadas modificadas
		System.out.println();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		// Deplazamos una coordenada
		p1.desplaza(1, 1);
		System.out.println("p1 desplazado: " + p1.toString());
	}

}