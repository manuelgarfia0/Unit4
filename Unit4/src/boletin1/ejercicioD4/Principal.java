package boletin1.ejercicioD4;

public class Principal {

	public static void main(String[] args) {
		// Declaro variables
		double pvp;
		// Creo un articulo
		Articulo a1 = new Articulo("Pijama", 10, 21, 47);
		// Calculo el pvp
		pvp = a1.getPvp();
		// Muestro la informacion
		System.out.println(a1.toString());
		// Aplicar descuento
		System.out.println(a1.toString() + " - PVPDescuento: " + a1.getPvpDescuento(5) + "€");
		System.out.println("Pijama vendido: " + a1.vender(1));
		// Muestro stock
		System.out.println(a1.getCuantosQuedan());
		// Rellenamos stock
		System.out.println("Rellenamos stock: " + a1.almacenar(5));
		System.out.println(a1.getCuantosQuedan());

	}
}