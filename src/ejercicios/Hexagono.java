package ejercicios;

public class Hexagono extends PoligonoRegular{

	public Hexagono(double longitudLado) {
		super("Hexagono", 6, longitudLado);
	}

	@Override
	public double getArea() {
		
		return (getPerimetro()*Math.sqrt(Math.pow(longitudLado, 2)-Math.pow((longitudLado/2), 2)))/2;
	}

}
