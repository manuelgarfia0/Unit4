package crud.ejercicio02;

import java.util.ArrayList;

/**
 * Clase que gestiona el inventario del almacén.
 * Centraliza todas las operaciones CRUD sobre los artículos.
 */
public class Almacen {

	private ArrayList<Articulo> articulos;

	public Almacen() {
		articulos = new ArrayList<>();
	}

	/**
	 * Da de alta un artículo si su código no existe ya en el almacén.
	 *
	 * @param articulo Artículo a añadir
	 * @return true si se añadió, false si el código ya existe
	 */
	public boolean alta(Articulo articulo) {
		boolean codigoLibre = buscarPorCodigo(articulo.getCodigo()) == null;
		if (codigoLibre) {
			articulos.add(articulo);
		}
		return codigoLibre;
	}

	/**
	 * Busca un artículo por código (insensible a mayúsculas).
	 *
	 * @param codigo Código del artículo
	 * @return El artículo encontrado, o null si no existe
	 */
	public Articulo buscarPorCodigo(String codigo) {
		Articulo encontrado = null;
		for (Articulo articulo : articulos) {
			if (articulo.getCodigo().equalsIgnoreCase(codigo)) {
				encontrado = articulo;
			}
		}
		return encontrado;
	}

	/**
	 * Da de baja (elimina) un artículo por código.
	 *
	 * @param codigo Código del artículo a eliminar
	 * @return true si se encontró y eliminó, false si no existe
	 */
	public boolean baja(String codigo) {
		Articulo articulo = buscarPorCodigo(codigo);
		boolean eliminado = articulo != null;
		if (eliminado) {
			articulos.remove(articulo);
		}
		return eliminado;
	}

	/**
	 * Imprime el inventario completo del almacén.
	 */
	public void listar() {
		if (articulos.isEmpty()) {
			System.out.println("El almacén está vacío.");
		} else {
			for (Articulo articulo : articulos) {
				System.out.println(articulo);
			}
		}
	}
}
