package ejercicios4;

public class ArrayReales implements Estadisticas{
	private double [] numeros;
	
	public ArrayReales(double[] numeros) {
		super();
		this.numeros = numeros;
	}

	@Override
	public double minimo() {
		double minValor = Double.MAX_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]<minValor) minValor = numeros[i];
		}
		return minValor;
	}

	@Override
	public double maximo() {
		double maxValor = Double.MIN_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>maxValor) maxValor = numeros[i];
		}
		return maxValor;
	}

	@Override
	public double sumatorio() {
		double suma=0;
		for (int i = 0; i < numeros.length; i++) {
			suma+=numeros[i];
		}
		return suma;
	}

}
