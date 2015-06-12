package ejercicios;

public class TrianguloEquilatero extends PoligonoRegular{

	public TrianguloEquilatero(double longitudLado) {
		super("Triangulo Equilatero", 3, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.cbrt(3)/4)*Math.pow(longitudLado, 2);
	}

}
