package ejercicios;

public abstract class PoligonoRegular implements Comparable{
	private String nombrePoligono;
	private int numLados;
	protected double longitudLado;
	public PoligonoRegular(String nombrePoligono, int numLados,
			double longitudLado) {
		this.nombrePoligono = nombrePoligono;
		this.numLados = numLados;
		this.longitudLado = longitudLado;
	}
	
	public double getPerimetro(){
		return longitudLado*numLados;
	}
	
	public abstract double getArea();
	

	@Override
	public String toString() {
		return "PoligonoRegular: nombrePoligono=" + nombrePoligono
				+ ", longitudLado=" + longitudLado;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(longitudLado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numLados;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Double.doubleToLongBits(longitudLado) != Double
				.doubleToLongBits(other.longitudLado))
			return false;
		if (numLados != other.numLados)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof PoligonoRegular){
			PoligonoRegular p = (PoligonoRegular) o;
			return Math.abs(this.numLados-p.numLados);
		} else {return -1;}
		
	}
	
	
	
}
