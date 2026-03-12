package crud.ejercicio03;

import java.util.ArrayList;

/**
 * Clase que gestiona los pedidos de pizzas del día.
 * Centraliza todas las operaciones sobre la lista de pedidos.
 */
public class Pizzeria {

	private ArrayList<Pizza> pedidos;

	public Pizzeria() {
		pedidos = new ArrayList<>();
	}

	/**
	 * Registra un nuevo pedido de pizza.
	 *
	 * @param pizza Pizza pedida
	 */
	public void nuevoPedido(Pizza pizza) {
		pedidos.add(pizza);
	}

	/**
	 * Busca un pedido pendiente por su código.
	 *
	 * @param codigo Código del pedido
	 * @return La pizza encontrada con estado PEDIDA, o null si no existe
	 */
	public Pizza buscarPedidoPendiente(int codigo) {
		Pizza encontrada = null;
		for (Pizza pizza : pedidos) {
			if (pizza.getCodigo() == codigo && pizza.getEstado() == Pizza.Estado.PEDIDA) {
				encontrada = pizza;
			}
		}
		return encontrada;
	}

	/**
	 * Marca una pizza como servida buscándola por código.
	 *
	 * @param codigo Código del pedido a marcar como servido
	 * @return true si se encontró y marcó, false si no hay pedido pendiente
	 */
	public boolean marcarServida(int codigo) {
		Pizza pizza = buscarPedidoPendiente(codigo);
		boolean encontrada = pizza != null;
		if (encontrada) {
			pizza.setEstado(Pizza.Estado.SERVIDA);
		}
		return encontrada;
	}

	/**
	 * Imprime todos los pedidos del día con su estado actual.
	 */
	public void listar() {
		if (pedidos.isEmpty()) {
			System.out.println("No hay pedidos registrados hoy.");
		} else {
			for (Pizza pizza : pedidos) {
				System.out.println(pizza);
			}
		}
	}
}
