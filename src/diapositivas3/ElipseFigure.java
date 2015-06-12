package diapositivas3;

public class ElipseFigure extends CircularFigure{

	public ElipseFigure(int semiEjeMenor, int semiEjeMayor) {
		super(semiEjeMenor, semiEjeMayor);
		
	}

	@Override
	public String getNombre() {
		
		return "Elipse";
	}

}
