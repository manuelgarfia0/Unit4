package boletin1.ejercicioD4;

public class Articulo {
	private String nombre = "Sin nombre";
	private double precio;
	private int iva = 21;
	private int cuantosQuedan;

	public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
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

	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public double getPvp() {
		double pvp = 0;

		pvp = this.precio * (1 + this.iva / 100.0);

		return pvp;
	}

	public double getPvpDescuento(int descuento) {
		double pvpDescuento = 0;
		double pvp;

		pvp = this.precio * (1 + this.iva / 100.0);
		pvpDescuento = pvp - (pvp * descuento / 100);

		return pvpDescuento;
	}

	public boolean vender(int cantidad) {
		boolean vendido = false;

		if (this.cuantosQuedan > cantidad) {
			this.cuantosQuedan -= cantidad;
			vendido = true;
		}
		return vendido;
	}

	public boolean almacenar(int cantidad) {
		boolean almacenado = false;
		if (cantidad > 0) {
			this.cuantosQuedan += cantidad;
			almacenado = true;
		}

		return almacenado;
	}

	@Override
	public String toString() {
		return this.nombre + " - Precio: " + this.precio + "€ - IVA: " + this.iva + "% - PVP: " + this.getPvp() + "€";
	}

}