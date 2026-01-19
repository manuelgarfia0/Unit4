package boletin2.ejercicio01;

public class CuentaCorriente {
	/**
	 * enum para nacionalidad española o extranjera
	 */
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	/**
	 * Atributo dni del dueño de la cuenta
	 */
	private String dni;
	/**
	 * Atributo nombre del dueño de la cuenta
	 */
	private String nombre;
	/**
	 * Atributo saldo del dueño de la cuenta, inicializado a 0
	 */
	private double saldo = 0;
	/**
	 * Atributo nacionalidad del dueño de la cuenta
	 */
	private Nacionalidad nacionalidad;

	/**
	 * Constructor con el dni y saldo de la cuenta
	 * 
	 * @param dni   DNI del dueño de la cuenta
	 * @param saldo Saldo de la cuenta
	 */
	public CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	/**
	 * Constructor con el dni, nombre y saldo del dueño de la cuenta
	 * 
	 * @param dni    DNI del dueño de la cuenta
	 * @param nombre Nombre del dueño de la cuenta
	 * @param saldo  Saldo de la cuenta
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * Constructor con el dni, nombre, saldo, y nacionalidad del dueño de la cuenta
	 * 
	 * @param dni          DNI del dueño de la cuenta
	 * @param nombre       Nombre del dueño de la cuenta
	 * @param saldo        Saldo de la cuenta
	 * @param nacionalidad Nacionalidad del dueño de la cuenta
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, Nacionalidad nacionalidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Método get del nombre del dueño de la cuenta
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método set del nombre del dueño de la cuenta
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método get del saldo de la cuenta
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método set del saldo de la cuenta
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método get del dni del dueño de la cuenta
	 * 
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Método get de la nacionalidad del dueño de la cuenta
	 * 
	 * @return nacionalidad
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Función para sacar dinero de la cuenta
	 * 
	 * @param cantidad Dinero a sacar
	 * @return Boolean a true si se ha podido sacar dinero, si no se queda en false
	 */
	public boolean sacarDinero(double cantidad) {
		boolean sacado = false;

		if (this.saldo > 0 && this.saldo - cantidad >= 0) {
			this.saldo -= cantidad;
			sacado = true;
		}

		return sacado;
	}

	/**
	 * Función para ingresar dinero en la cuenta
	 * 
	 * @param cantidad Dinero a ingresar en la cuenta
	 * @return Boolean a true si se ha podido ingresar el dinero, si no se queda en
	 *         false
	 */
	public boolean ingresarDinero(double cantidad) {
		boolean ingresado = false;

		if (cantidad > 0) {
			this.saldo += cantidad;
			ingresado = true;
		}

		return ingresado;
	}

	@Override
	/**
	 * Método equals para comparar dos cuentas, si los dni y nombres son iguales,
	 * equals es true, si no, false
	 */
	public boolean equals(Object obj) {
		boolean iguales = false;
		CuentaCorriente cuenta2 = (CuentaCorriente) obj;
		if (this.dni.equals(cuenta2.dni) && this.nombre.equals(cuenta2.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	/**
	 * Método toString para mostrar la información de la cuenta
	 */
	public String toString() {
		return "Cuenta (" + "DNI = " + dni + ", " + "nombre = " + nombre + ", " + "saldo = " + saldo + ", "
				+ "nacionalidad = " + nacionalidad + ")";
	}

}
