package diapositivas3;

public class CircunferenciaFigure extends CircularFigure{

	public CircunferenciaFigure(int eje) {
		super(eje, eje);
	}

	@Override
	public String getNombre() {
		return "Circulo";
	}

}
