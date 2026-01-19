package boletin2.ejercicio02;

public class Libro {
	/**
	 * enum para el genero del libro
	 */
	enum Genero {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}

	/**
	 * Atributo titulo del libro
	 */
	private String titulo;
	/**
	 * Atributo autor del libro
	 */
	private String autor;
	/**
	 * Atributo ejemplares que tiene el libro
	 */
	private int ejemplares;
	/**
	 * Atributo ejemplaresPrestados del libro
	 */
	private int ejemplaresPrestados;
	/**
	 * Atributo genero del libro
	 */
	private Genero genero;

	/**
	 * Constructor del libro
	 * 
	 * @param titulo Titulo del libro
	 * @param autor  Autor del libro
	 */
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	/**
	 * Constructor del libro
	 * 
	 * @param titulo              Titulo del libro
	 * @param autor               Autor del libro
	 * @param ejemplares          Ejemplares que tiene el libro
	 * @param ejemplaresPrestados Ejemplares que están prestados del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	/**
	 * Constructor del libro
	 * 
	 * @param titulo              Titulo del libro
	 * @param autor               Autor del libro
	 * @param ejemplares          Ejemplares que tiene el libro
	 * @param ejemplaresPrestados Ejemplares que están prestados del libro
	 * @param genero              Genero del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, Genero genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		this.genero = genero;
	}
	// Getters y Setters

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public Genero getGenero() {
		return genero;
	}

	/**
	 * Funcion para coger prestado un libro
	 * 
	 * @return Boolean que indica true si se ha podido prestar, false si no
	 */
	public boolean prestamo() {
		boolean prestado = false;

		if (this.ejemplaresPrestados < this.ejemplares) {
			this.ejemplaresPrestados++;
			prestado = true;
		}

		return prestado;
	}

	/**
	 * Método para devolver un libro prestado
	 * 
	 * @return Boolean que indica true si se ha podido devolver, false si no
	 */
	public boolean devolucion() {
		boolean devuelto = false;

		if (this.ejemplaresPrestados > 0) {
			this.ejemplaresPrestados--;
			devuelto = true;
		}

		return devuelto;
	}

	@Override
	/**
	 * Método equals que compara los titulos y el autor de dos libro para comprobar
	 * si son iguales
	 */
	public boolean equals(Object obj) {
		boolean iguales = false;
		Libro otroLibro = (Libro) obj;
		if (this.titulo.equals(otroLibro.titulo) && this.autor.equals(otroLibro.autor)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	/**
	 * Método toString para mostrar la información del libro
	 */
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPrestados="
				+ ejemplaresPrestados + ", genero=" + genero + "]";
	}

}
