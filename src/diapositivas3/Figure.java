package diapositivas3;

public interface Figure {
	//definir una constante
	double NUMERO_PI = 3.1415;
	//comportamiento de los objetos
	double getPerimetro();
	
	String getNombre();
	//metodos default
	//posibles en jdk 1.8
	default String getTodo(){
		return getPerimetro() + " - "+ getNombre();
	}
	
}
