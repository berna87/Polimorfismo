package ejercicios2;

public abstract class Trabajador {
	private String nombre;
	private String apellidos;
	public Trabajador(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	protected String nombreApellidos(){
		return this.nombre+" "+this.apellidos;
	}
	public abstract double sueldoMensual(int diasTrabajados);
}
