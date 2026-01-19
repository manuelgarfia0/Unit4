package boletin2.ejercicio04;

public class Pizza {
	/**
	 * enum para el tamaño de la pizza
	 */
	enum Tamaño {
		MEDIANA, FAMILIAR
	}

	/**
	 * enum para el tipo de pizza
	 */
	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}

	/**
	 * enum para el estado de la pizza
	 */
	enum Estado {
		PEDIDA, SERVIDA
	}

	/**
	 * Atributo para el codigo de la pizza
	 */
	private int codigo;
	/**
	 * Atributo para el tamaño de la pizza
	 */
	private Tamaño tamaño;
	/**
	 * Atributo para el tipo de pizza
	 */
	private Tipo tipo;
	/**
	 * Atributo para el estado de la pizza
	 */
	private Estado estado = Estado.PEDIDA;

	/**
	 * Constructor para la pizza
	 * 
	 * @param codigo Codigo de la pizza
	 * @param tamaño Tamaño de la pizza
	 * @param tipo   Tipo de la pizza
	 */
	public Pizza(int codigo, Tamaño tamaño, Tipo tipo) {
		super();
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}

	// getters y setter

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public Tipo getTipo() {
		return tipo;
	}

	@Override
	/**
	 * Método equals para comprobar que dos pizzas son iguales si tienen el mismo
	 * codigo
	 */
	public boolean equals(Object obj) {
		boolean iguales = false;
		Pizza otraPizza = (Pizza) obj;
		if (this.codigo == otraPizza.codigo) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	/**
	 * Método toString para mostrar la informacion de la pizza
	 */
	public String toString() {
		return this.codigo + ": " + this.tamaño + " - " + this.tipo + " - " + this.estado;
	}

}
