package boletin4.ejercicio03;

public class Fecha {

	int dia;
	int mes;
	int año;

	public Fecha(int dia, int mes, int año) {
		super();
		if (dia > 0 && dia <= 31) {
			this.dia = dia;
		}
		if (mes > 0 && mes <= 12) {
			this.mes = mes;
		}
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAño() {
		return año;
	}

	public boolean esBisiesto() {
		boolean bisiesto = false;
		if (this.año % 4 == 0) {
			bisiesto = true;
		}
		return bisiesto;
	}

	private int obtenerDiasDelMes() {

		int dias;

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			dias = 31;
		}
		case 4, 6, 9, 11 -> {
			dias = 30;
		}

		case 2 -> {
			dias = esBisiesto() ? 29 : 28;
		}

		default -> {
			dias = 0;
		}
		}

		return dias;
	}

	public boolean fechaCorrecta() {

		boolean fechaValida = true;

		if (this.año <= 0 || this.mes < 1 || this.mes > 12) {
			fechaValida = false;
		}

		if (fechaValida) {
			int diasMes = obtenerDiasDelMes();

			if (this.dia < 1 || this.dia > diasMes) {
				fechaValida = false;
			}
		}

		return fechaValida;
	}

	public void diaSiguiente() {

		this.dia++;

		int diasMes = obtenerDiasDelMes();

		if (this.dia > diasMes) {
			this.dia = 1;
			this.mes++;

			if (this.mes > 12) {
				this.mes = 1;
				this.año++;
			}
		}
	}

	@Override
	public String toString() {
		String mostrar;
		String dia = this.dia + "-";
		String mes = this.mes + "-";
		if (this.dia / 10 < 1) {
			dia = "0" + this.dia + "-";
		}
		if (this.mes / 10 < 1) {
			mes = "0" + this.mes + "-";
		}
		mostrar = dia + mes + this.año;
		return mostrar;
	}

}
