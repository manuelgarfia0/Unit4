package boletin1.ejercicioB4;

public class Articulo {
	String nombre;
	double precio;
	int cuantosQuedan;
	final int iva = 21;

	public Articulo(String nombre, double precio, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
}
