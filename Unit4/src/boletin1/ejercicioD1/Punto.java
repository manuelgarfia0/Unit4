package boletin1.ejercicioD1;

public class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void desplaza(int dx, int dy) {
		this.x = x + dx;
		this.y = y + dy;
	}

	public double distancia(Punto p) {
		double d;

		d = Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));

		return d;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}