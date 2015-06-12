package diapositivas3;

public class TrianguloEquilateroFigure extends TrianguloFigure{
	
	
	
	
	public TrianguloEquilateroFigure(int lado) {
		super(lado, lado, lado);
		
	}

	@Override
	public String getNombre() {
		return "Triangulo Equilatero";
	}

}
