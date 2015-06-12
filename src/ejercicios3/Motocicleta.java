package ejercicios3;

public class Motocicleta implements Vehiculo{
	private int velocidad=0;
	@Override
	public String acelerar(int valor) {
		velocidad+=valor;
		if(velocidad>VELOCIDAD_MAXIMA) System.out.println("Cuidado: La motocicleta ha superado la velocidad maxima");
		return "Motocicleta se encuentra a "+this.velocidad+" km/h";
	}

	@Override
	public String frenar(int valor) {
		velocidad-=valor;
		if(velocidad<0)velocidad=0;
		return "Motocicleta se encuentra a "+this.velocidad+" km/h";
	}

}
