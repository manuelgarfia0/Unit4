package boletin1.ejercicioC4;

public class Principal {

	public static void main(String[] args) {
		// Declaro variables
		double pvp;
		// Creo un articulo
		Articulo a1 = new Articulo("Pijama", 10, 21, 47);
		// Calculo el pvp
		pvp = calcularPvp(a1);
		// Muestro la informacion
		mostrar(a1, pvp);
	}

	static void mostrar(Articulo a, double pvp) {
		System.out.println(
				a.getNombre() + " - Precio: " + a.getPrecio() + "€ - IVA: " + a.getIva() + "% - PVP: " + pvp + "€");
	}

	static double calcularPvp(Articulo a) {
		double pvp;
		pvp = a.getPrecio() * (1 + a.getIva() / 100.0);
		return pvp;
	}

}
