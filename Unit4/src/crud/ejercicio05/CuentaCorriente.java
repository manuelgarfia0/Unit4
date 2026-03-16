package crud.ejercicio05;

/**
 * Clase que representa una cuenta corriente bancaria.
 */
public class CuentaCorriente {

	/**
	 * Nacionalidad del titular de la cuenta.
	 */
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	private String dni;
	private String nombre;
	private double saldo = 0;
	private Nacionalidad nacionalidad;

	/**
	 * Constructor con dni y saldo.
	 *
	 * @param dni   DNI del titular
	 * @param saldo Saldo inicial
	 */
	public CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	/**
	 * Constructor con dni, nombre y saldo.
	 *
	 * @param dni    DNI del titular
	 * @param nombre Nombre del titular
	 * @param saldo  Saldo inicial
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * Constructor completo con todos los datos del titular.
	 *
	 * @param dni          DNI del titular
	 * @param nombre       Nombre del titular
	 * @param saldo        Saldo inicial
	 * @param nacionalidad Nacionalidad del titular
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, Nacionalidad nacionalidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Constructor de búsqueda. Crea una cuenta solo con el DNI para poder usar
	 * equals y localizar la cuenta real en la colección.
	 *
	 * @param dni DNI del titular a buscar
	 */
	public CuentaCorriente(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
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

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Ingresa dinero en la cuenta.
	 *
	 * @param cantidad Importe a ingresar (debe ser positivo)
	 * @return true si el ingreso se realizó correctamente
	 */
	public boolean ingresarDinero(double cantidad) {
		boolean ingresado = cantidad > 0;
		if (ingresado) {
			this.saldo += cantidad;
		}
		return ingresado;
	}

	/**
	 * Saca dinero de la cuenta si hay saldo suficiente.
	 *
	 * @param cantidad Importe a retirar (debe ser positivo y no superar el saldo)
	 * @return true si la retirada se realizó correctamente
	 */
	public boolean sacarDinero(double cantidad) {
		boolean sacado = this.saldo > 0 && this.saldo - cantidad >= 0;
		if (sacado) {
			this.saldo -= cantidad;
		}
		return sacado;
	}

	/**
	 * Dos cuentas son iguales si pertenecen al mismo titular (mismo DNI).
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		CuentaCorriente otraCuenta = (CuentaCorriente) obj;
		if (this.dni.equalsIgnoreCase(otraCuenta.dni)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + ", nacionalidad="
				+ nacionalidad + "]";
	}
}
