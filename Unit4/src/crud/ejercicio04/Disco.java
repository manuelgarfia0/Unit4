package crud.ejercicio04;

/**
 * Clase que representa un disco de música en una colección.
 */
public class Disco {

	/**
	 * Géneros musicales disponibles.
	 */
	enum Genero {
		ROCK, POP, JAZZ, BLUES
	}

	private String codigo;
	private String autor;
	private String titulo;
	private int duracion; // en segundos
	private Genero genero;

	/**
	 * Constructor completo del disco.
	 *
	 * @param codigo   Código identificador único
	 * @param autor    Nombre del autor o grupo
	 * @param titulo   Título del disco
	 * @param duracion Duración total en segundos
	 * @param genero   Género musical
	 */
	public Disco(String codigo, String autor, String titulo, int duracion, Genero genero) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		if (duracion > 0) {
			this.duracion = duracion;
		}
		this.genero = genero;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (!autor.isBlank()) {
			this.autor = autor;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (!titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Devuelve la duración formateada como mm:ss.
	 *
	 * @return Duración en formato mm:ss
	 */
	public String getDuracionFormateada() {
		return String.format("%d:%02d", duracion / 60, duracion % 60);
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Disco otroDisco = (Disco) obj;
		if (this.codigo.equalsIgnoreCase(otroDisco.codigo)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo
				+ ", duracion=" + getDuracionFormateada() + ", genero=" + genero + "]";
	}
}
