package diapositivas2;

public abstract class FigurasGeometricas {
	private String nombre;

	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double getArea();
	
}

class Circulo extends FigurasGeometricas{
	private double radio;

	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + " Nombre=" + getNombre() + "]";
	}
}

abstract class Cuadrilatero extends FigurasGeometricas{
	private double lado1;
	private double lado2;
	public Cuadrilatero(String nombre, double lado1, double lado2) {
		super(nombre);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
}

class Cuadrado extends Cuadrilatero{

	public Cuadrado(double lado1) {
		super("Cuadrado", lado1, lado1);
	}

	@Override
	public double getArea() {
		return Math.pow(getLado1(),2);
	}

	@Override
	public String toString() {
		return "Cuadrado [Lado()=" + getLado1() + ", Nombre="
				+ getNombre() + "]";
	}
}

class Rectangulo extends Cuadrilatero{

	public Rectangulo(double lado1, double lado2) {
		super("Rectangulo", lado1, lado2);
	}

	@Override
	public String toString() {
		return "Rectangulo [Lado1=" + getLado1() + ", Lado2="
				+ getLado2() + ", Nombre=" + getNombre() + "]";
	}

	@Override
	public double getArea() {
		return getLado1()*getLado2();
	}
}
