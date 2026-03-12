package crud.ejercicio05;

import java.util.ArrayList;

/**
 * Clase que gestiona la colección de cuentas corrientes.
 * La búsqueda se realiza por el DNI del titular.
 */
public class GestionCuentas {

	private ArrayList<CuentaCorriente> cuentas;

	public GestionCuentas() {
		cuentas = new ArrayList<>();
	}

	/**
	 * Abre una nueva cuenta si no existe ya una cuenta con el mismo DNI.
	 *
	 * @param cuenta Cuenta a añadir
	 * @return true si se abrió, false si el DNI ya tiene cuenta
	 */
	public boolean abrirCuenta(CuentaCorriente cuenta) {
		boolean dniLibre = buscarPorDni(cuenta.getDni()) == null;
		if (dniLibre) {
			cuentas.add(cuenta);
		}
		return dniLibre;
	}

	/**
	 * Busca una cuenta por el DNI del titular.
	 *
	 * @param dni DNI del titular a buscar
	 * @return La cuenta encontrada, o null si no existe
	 */
	public CuentaCorriente buscarPorDni(String dni) {
		CuentaCorriente encontrada = null;
		for (CuentaCorriente cuenta : cuentas) {
			if (cuenta.equals(new CuentaCorriente(dni))) {
				encontrada = cuenta;
			}
		}
		return encontrada;
	}

	/**
	 * Cierra (elimina) una cuenta buscada por DNI.
	 *
	 * @param dni DNI del titular cuya cuenta se quiere cerrar
	 * @return true si se encontró y cerró, false si no existe
	 */
	public boolean cerrarCuenta(String dni) {
		CuentaCorriente cuenta = buscarPorDni(dni);
		boolean cerrada = cuenta != null;
		if (cerrada) {
			cuentas.remove(cuenta);
		}
		return cerrada;
	}

	/**
	 * Imprime el listado de todas las cuentas registradas.
	 */
	public void listar() {
		if (cuentas.isEmpty()) {
			System.out.println("No hay cuentas registradas.");
		} else {
			for (CuentaCorriente cuenta : cuentas) {
				System.out.println(cuenta);
			}
		}
	}
}
