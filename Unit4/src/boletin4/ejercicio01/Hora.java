package boletin4.ejercicio01;

public class Hora {

	int hora;
	int minuto;
	int segundo;

	public Hora(int hora, int minuto, int segundo) {
		if (hora < 24 && hora >= 0) {
			this.hora = hora;
		}
		if (minuto < 60 && minuto >= 0) {
			this.minuto = minuto;
		}
		if (segundo < 60 && segundo >= 0) {
			this.segundo = segundo;
		}

	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void incrementarSegundo() {
		this.segundo++;
		if (this.segundo == 60) {
			this.segundo = 0;
			incrementarMinuto();
		}
	}

	public void incrementarMinuto() {
		this.minuto++;
		if (this.minuto == 60) {
			this.minuto = 0;
			incrementarHora();
		}
	}

	public void incrementarHora() {
		this.hora++;
		if (this.hora == 24) {
			this.hora = 0;
		}
	}

	@Override
	public String toString() {
		return this.hora + " : " + this.minuto + " : " + this.segundo;
	}

}
