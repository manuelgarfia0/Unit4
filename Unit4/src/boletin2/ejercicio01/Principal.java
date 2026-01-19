package boletin2.ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// Crear cuentas corrientes
		CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Ana Gómez", 1000.0,
				CuentaCorriente.Nacionalidad.ESPAÑOLA);
		CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 500.0,
				CuentaCorriente.Nacionalidad.ESPAÑOLA);
		CuentaCorriente cuenta3 = new CuentaCorriente("12345678A", "Ana Gómez", 2000.0,
				CuentaCorriente.Nacionalidad.EXTRANJERA);

		// Mostrar información de las cuentas
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);

		System.out.println();
		
		// Operaciones con las cuentas
		System.out.println("Sacar 200 de cuenta1: " + cuenta1.sacarDinero(200));
		System.out.println("Ingresar 300 en cuenta2: " + cuenta2.ingresarDinero(500));
		System.out.println("Sacar 1000 de cuenta3: " + cuenta3.sacarDinero(2001));

		System.out.println();
		
		// Mostrar información actualizada de las cuentas
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		
		System.out.println();
		
		// Mostrar si las cuentas son iguales o distintas
		System.out.println("cuenta1 y cuenta3 son iguales: " + cuenta1.equals(cuenta3));
		System.out.println("cuenta1 y cuenta2 son iguales: " + cuenta1.equals(cuenta2));
	}
}