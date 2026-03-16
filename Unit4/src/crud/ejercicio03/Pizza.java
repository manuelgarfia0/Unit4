package crud.ejercicio03;

/**
 * Clase que representa una pizza pedida en el día.
 */
public class Pizza {

	/**
	 * Tamano disponible de la pizza.
	 */
	enum Tamano {
		MEDIANA, FAMILIAR
	}

	/**
	 * Tipo de pizza disponible.
	 */
	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}

	/**
	 * Estado del pedido de la pizza.
	 */
	enum Estado {
		PEDIDA, SERVIDA
	}

	private int codigo;
	private Tamano tamano;
	private Tipo tipo;
	private Estado estado = Estado.PEDIDA;

	/**
	 * Constructor de la pizza. El estado inicial siempre es PEDIDA.
	 *
	 * @param codigo Código identificador del pedido
	 * @param tamano Tamano de la pizza
	 * @param tipo   Tipo de pizza
	 */
	public Pizza(int codigo, Tamano tamano, Tipo tipo) {
		this.codigo = codigo;
		this.tamano = tamano;
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public Tamano getTamano() {
		return tamano;
	}

	public Tipo getTipo() {
		return tipo;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Pizza otraPizza = (Pizza) obj;
		if (this.codigo == otraPizza.codigo) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return this.codigo + ": " + this.tamano + " - " + this.tipo + " - " + this.estado;
	}
}
