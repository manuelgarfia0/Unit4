package boletin1.ejercicioB4;

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
		System.out.println(a.nombre + " - Precio: " + a.precio + "€ - IVA: " + a.iva + "% - PVP: " + pvp + "€");
	}

	static double calcularPvp(Articulo a) {
		double pvp;
		pvp = a.precio * (1 + a.iva / 100.0);
		return pvp;
	}

}
