package ejercicios2;

public class Oficial extends Trabajador{
	private static final double PAGA_DIARIA = 100;
	private String clase;
	public Oficial(String nombre, String apellidos, String clase) {
		super(nombre, apellidos);
		this.clase = clase;
	}
	@Override
	public double sueldoMensual(int diasTrabajados) {
		
		return diasTrabajados*this.PAGA_DIARIA;
	}
	public String getClase() {
		return clase;
	}
	
	
}
