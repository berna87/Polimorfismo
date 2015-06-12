package diapositivas;

public class TestFigura {

	public static void main(String[] args) {
		Figura f = new Circulo("Rojo", 3);
		System.out.println(datosFigura(f));
		Figura f2 = new Cuadrado("Azul", 5);
		System.out.println(datosFigura(f2));
	}
	public static String datosFigura(Figura f){
		return f+" tiene un area de: "+Math.round(f.getArea());
	}
}

class Figura{
	private String color;

	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	//definimos un metodo llamado getArea
	//deberia hacerse con interfaces o clases abstractas
	public double getArea(){
		return 0;
	}
}

class Circulo extends Figura{
	private double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + " Color=" + getColor() + "]";
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.radio,2);
	}
}

class Cuadrilatero extends Figura{
	private double lado1;
	private double lado2;
	
	public Cuadrilatero(String color, double lado1, double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	@Override
	public String toString() {
		return "Cuadrilatero [lado1=" + lado1 + ", lado2=" + lado2 + " color="+getColor();
	}
	@Override
	public double getArea() {
		return this.lado1*this.lado2;
	}
}

class Cuadrado extends Cuadrilatero{

	public Cuadrado(String color, double lado) {
		super(color, lado, lado);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cuadrado [" + super.toString() + "]";
	}
}