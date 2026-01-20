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

	public boolean fechaCorrecta() {
		boolean correcta = false;

		return correcta;
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
