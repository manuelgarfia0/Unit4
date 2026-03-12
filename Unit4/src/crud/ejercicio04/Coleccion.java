package crud.ejercicio04;

import java.util.ArrayList;

/**
 * Clase que gestiona la colección personal de discos.
 * Centraliza todas las operaciones CRUD sobre el inventario.
 */
public class Coleccion {

	private ArrayList<Disco> discos;

	public Coleccion() {
		discos = new ArrayList<>();
	}

	/**
	 * Añade un disco a la colección si su código no existe ya.
	 *
	 * @param disco Disco a añadir
	 * @return true si se añadió, false si el código ya existe
	 */
	public boolean aniadir(Disco disco) {
		boolean codigoLibre = buscarPorCodigo(disco.getCodigo()) == null;
		if (codigoLibre) {
			discos.add(disco);
		}
		return codigoLibre;
	}

	/**
	 * Busca un disco por código (insensible a mayúsculas).
	 *
	 * @param codigo Código del disco a buscar
	 * @return El disco encontrado, o null si no existe
	 */
	public Disco buscarPorCodigo(String codigo) {
		Disco encontrado = null;
		for (Disco disco : discos) {
			if (disco.getCodigo().equalsIgnoreCase(codigo)) {
				encontrado = disco;
			}
		}
		return encontrado;
	}

	/**
	 * Elimina un disco de la colección por código.
	 *
	 * @param codigo Código del disco a eliminar
	 * @return true si se encontró y eliminó, false si no existe
	 */
	public boolean eliminar(String codigo) {
		Disco disco = buscarPorCodigo(codigo);
		boolean eliminado = disco != null;
		if (eliminado) {
			discos.remove(disco);
		}
		return eliminado;
	}

	/**
	 * Imprime el listado completo de la colección.
	 */
	public void listar() {
		if (discos.isEmpty()) {
			System.out.println("La colección está vacía.");
		} else {
			for (Disco disco : discos) {
				System.out.println(disco);
			}
		}
	}
}
