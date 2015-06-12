package ejercicios;

public class Cuadrado extends PoligonoRegular{

	public Cuadrado(double longitudLado) {
		super("Cuadrado", 4, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return longitudLado*longitudLado;
	}
	
}
