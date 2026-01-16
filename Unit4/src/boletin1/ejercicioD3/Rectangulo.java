package boletin1.ejercicioD3;

public class Rectangulo {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public void setX1Y1(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}

	public void setX2Y2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	public void setAll(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getAlto() {
		int alto = 0;

		alto = Math.abs(this.y2 - this.y1);

		return alto;
	}

	public int getAncho() {
		int ancho = 0;

		ancho = Math.abs(this.x2 - this.x1);

		return ancho;
	}

	public int getPerimetro() {
		int perimetro = 0;

		perimetro = 2 * (getAlto() + getAncho());

		return perimetro;
	}

	public double getArea() {
		double area = 0;

		area = getAlto() * getAncho();

		return area;
	}

	@Override
	public String toString() {
		return "(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")";
	}

}