package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class EjemploInstanceOf {
	private static List<Persona> lista = new ArrayList<Persona>();
	public static void main(String[] args) {
		Persona p1 = new Profesor(30, "Pepe", "Matematicas",false);
		Persona p2 = new Profesor(28, "Pedro", "FQ",true);
		Persona p3 = new Alumno(15, "Jose", "1º");
		Persona p4 = new Alumno(16, "Ana", "2º");
		Persona p5 = new Persona(20, "Juan");
		lista.add(p1); lista.add(p2); lista.add(p3); lista.add(p4); lista.add(p5);
		System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4+"\n"+p5);
		System.out.println(p1.getEdad()+"\n"+p2.getEdad()+"\n"+p3.getEdad()+"\n"+p4.getEdad()+"\n"+p5.getEdad());
		for (Persona p : lista) {
			if (p instanceof Profesor){
				System.out.println("Es interino: "+((Profesor)p).esInterino());
			}
			if (p instanceof Alumno){
				System.out.println("Es mayor de edad: "+((Alumno)p).mayorDeEdad());
			}
			
		}
	}

}


class Persona{
	private int edad;
	private String Nombre;
	public Persona(int edad, String nombre) {
		this.edad = edad;
		Nombre = nombre;
	}
	protected int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	protected String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}

class Profesor extends Persona{
	private String asignatura;
	private boolean interino;
	public Profesor(int edad, String nombre, String asignatura, boolean interino) {
		super(edad, nombre);
		this.asignatura = asignatura;
	}
	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + " Edad="
				+ getEdad() + " Nombre" + getNombre() + "]";
	}
	public boolean esInterino(){
		return this.interino;
	}
}

class Alumno extends Persona{
	private String curso;
	public Alumno(int edad, String nombre, String curso) {
		super(edad, nombre);
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + " Edad=" + getEdad()
				+ " Nombre=" + getNombre() + "]";
	}
	public boolean mayorDeEdad(){
		return getEdad()>17;
	}
	
}