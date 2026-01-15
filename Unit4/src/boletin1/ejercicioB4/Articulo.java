package boletin1.ejercicioB4;

public class Articulo {
	String nombre = "Sin nombre";
	double precio;
	int iva = 21;
	int cuantosQuedan;

	public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (precio >= 0) {
			this.precio = precio;
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
}