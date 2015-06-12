package ejercicios3;

public class Coche implements Vehiculo{
	private int velocidad=0;
	
	
	
	@Override
	public String acelerar(int valor) {
		velocidad+=valor;
		if(velocidad>VELOCIDAD_MAXIMA) System.out.println("Cuidado: El coche ha superado la velocidad maxima");
		return "Coche se encuentra a "+this.velocidad+" km/h";
	}

	@Override
	public String frenar(int valor) {
		velocidad-=valor;
		if(velocidad<0)velocidad=0;
		return "Coche se encuentra a "+this.velocidad+" km/h";
	}

}
