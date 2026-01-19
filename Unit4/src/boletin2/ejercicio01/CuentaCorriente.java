package boletin2.ejercicio01;

public class CuentaCorriente {

	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	private String dni;
	private String nombre;
	private double saldo = 0;
	private Nacionalidad nacionalidad;

	public CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombre, double saldo, Nacionalidad nacionalidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public boolean sacarDinero(double cantidad) {
		boolean sacado = false;

		if (this.saldo > 0 && this.saldo - cantidad >= 0) {
			this.saldo -= cantidad;
			sacado = true;
		}

		return sacado;
	}

	public boolean ingresarDinero(double cantidad) {
		boolean ingresado = false;

		if (cantidad > 0) {
			this.saldo += cantidad;
			ingresado = true;
		}

		return ingresado;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		CuentaCorriente cuenta2 = (CuentaCorriente) obj;
		if (this.dni.equals(cuenta2.dni) && this.nombre.equals(cuenta2.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return "Cuenta (" + "DNI = " + dni + ", " + "nombre = " + nombre + ", " + "saldo = " + saldo + ", "
				+ "nacionalidad = " + nacionalidad + ")";
	}

}
