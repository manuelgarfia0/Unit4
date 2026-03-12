package crud.ejercicio02;

/**
 * Clase que representa un artículo del almacén. Basada en
 * boletin1.ejercicioD4.Articulo, añadiendo codigo, equals y refactorizando los
 * métodos de stock para el programa GESTISIMAL.
 */
public class Articulo {

	private String codigo;
	private String nombre = "Sin nombre";
	private double precio;
	private int iva = 21;
	private int cuantosQuedan;

	/**
	 * Constructor completo del artículo.
	 *
	 * @param codigo        Código identificador único
	 * @param nombre        Nombre del artículo
	 * @param precio        Precio base sin IVA
	 * @param iva           Porcentaje de IVA (0-21)
	 * @param cuantosQuedan Stock inicial
	 */
	public Articulo(String codigo, String nombre, double precio, int iva, int cuantosQuedan) {
		this.codigo = codigo;
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (precio >= 0) {
			this.precio = precio;
		}
		if (iva >= 0 && iva <= 21) {
			this.iva = iva;
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		if (iva >= 0 && iva <= 21) {
			this.iva = iva;
		}
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Calcula el precio de venta al público con IVA incluido.
	 *
	 * @return PVP del artículo
	 */
	public double getPvp() {
		return this.precio * (1 + this.iva / 100.0);
	}

	/**
	 * Incrementa el stock (entrada de mercancía).
	 *
	 * @param cantidad Unidades a añadir al almacén
	 * @return true si la cantidad es positiva y se ha almacenado
	 */
	public boolean almacenar(int cantidad) {
		boolean almacenado = cantidad > 0;
		if (almacenado) {
			this.cuantosQuedan += cantidad;
		}
		return almacenado;
	}

	/**
	 * Decrementa el stock (salida de mercancía). Controla que no se retire más de
	 * lo disponible.
	 *
	 * @param cantidad Unidades a retirar del almacén
	 * @return true si hay suficiente stock y se ha realizado la salida
	 */
	public boolean vender(int cantidad) {
		boolean vendido = cantidad > 0 && this.cuantosQuedan >= cantidad;
		if (vendido) {
			this.cuantosQuedan -= cantidad;
		}
		return vendido;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Articulo otroArticulo = (Articulo) obj;
		if (this.codigo.equalsIgnoreCase(otroArticulo.codigo)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return "[" + codigo + "] " + nombre + " - Precio: " + precio + "€ - IVA: " + iva + "% - PVP: " + getPvp()
				+ "€ - Stock: " + cuantosQuedan;
	}
}
