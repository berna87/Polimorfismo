package diapositivas3;

import java.util.ArrayList;
import java.util.List;

public class TestFigure {

	public static void main(String[] args) {
		Figure f1 = new TrianguloEquilateroFigure(5);
		Figure f2 = new TrianguloIsoscelesFigure(3, 4);
		Figure f3 = new ElipseFigure(3, 4);
		Figure f4 = new CircunferenciaFigure(3);
		List<Figure> list = new ArrayList<Figure>();
		list.add(f1); list.add(f2); list.add(f3); list.add(f4);
		
		for (Figure figure : list) {
			System.out.println(figure.getTodo());
		}
		//para hacer un new Figure() se crea como clase anonima y es obligatorio definir los metodos no definidos
	}

}
