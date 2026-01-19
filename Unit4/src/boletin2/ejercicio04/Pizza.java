package boletin2.ejercicio04;

public class Pizza {

	enum Tamaño {
		MEDIANA, FAMILIAR
	}

	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}

	enum Estado {
		PEDIDA, SERVIDA
	}

	private int codigo;
	private Tamaño tamaño;
	private Tipo tipo;
	private Estado estado = Estado.PEDIDA;

	public Pizza(int codigo, Tamaño tamaño, Tipo tipo) {
		super();
		this.codigo = codigo;
		this.tamaño = tamaño;
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

	public Tamaño getTamaño() {
		return tamaño;
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
		return this.codigo + ": " + this.tamaño + " - " + this.tipo + " - " + this.estado;
	}

}
