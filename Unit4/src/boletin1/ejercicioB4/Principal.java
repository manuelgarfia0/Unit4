package boletin1.ejercicioB4;

public class Principal {

	public static void main(String[] args) {
		// Declaro variables
		double pvp;
		// Creo un articulo
		Articulo a1 = new Articulo("Pijama", 10, 47);
		// Calculo el pvp
		pvp = a1.precio * (1 + a1.iva / 100.0);
		// Muestro la informacion
		System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + pvp + "€");
	}

}
