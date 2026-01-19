package boletin2.ejercicio02;

import java.util.Objects;

public class Libro {

	enum Genero {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}

	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;
	private Genero genero;

	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, Genero genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		this.genero = genero;
	}

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

	public boolean prestamo() {
		boolean prestado = false;

		if (this.ejemplaresPrestados < this.ejemplares) {
			this.ejemplaresPrestados++;
			prestado = true;
		}

		return prestado;
	}

	public boolean devolucion() {
		boolean devuelto = false;

		if (this.ejemplaresPrestados > 0) {
			this.ejemplaresPrestados--;
			devuelto = true;
		}

		return devuelto;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Libro otroLibro = (Libro) obj;
		if (this.titulo.equals(otroLibro.titulo) && this.autor.equals(otroLibro.autor)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPrestados="
				+ ejemplaresPrestados + ", genero=" + genero + "]";
	}

}
