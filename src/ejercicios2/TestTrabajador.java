package ejercicios2;

import java.util.ArrayList;
import java.util.List;

public class TestTrabajador {

	public static void main(String[] args) {
		Trabajador t1= new Oficial("Paco","Jimenez Lopez","Gruista");
		Trabajador t2= new Oficial("Pedro","Fernandez Gutierrez","Peon");
		Trabajador t3= new Oficial("Jose","Cobo Lopez","Transportista");
		Trabajador t4= new Tecnico("Juan", "Molina Molina", true);
		Trabajador t5= new Tecnico("Jesus", "Catena Jimenez", false);
		List<Trabajador> lista = new ArrayList<Trabajador>();
		lista.add(t1); lista.add(t2); lista.add(t3); lista.add(t4); lista.add(t5);
		for (Trabajador trabajador : lista) {
			System.out.println(trabajador.nombreApellidos()+" con sueldo: "+trabajador.sueldoMensual(30));
		}
		
		
	}

}
