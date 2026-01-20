package boletin4.ejercicio02;

public class Contador {

	int cont;

	public Contador(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

	public int getCont() {
		return cont;
	}

	public void incrementar() {
		this.cont++;
	}

	public void decrementar() {
		this.cont--;
		if (this.cont < 0) {
			this.cont = 0;
		}
	}

	@Override
	public String toString() {
		return "Contador " + this.cont;
	}

}
