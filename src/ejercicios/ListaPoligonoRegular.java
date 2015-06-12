package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligonoRegular {
	private List<PoligonoRegular> lista;
	public ListaPoligonoRegular(){
		lista = new ArrayList<PoligonoRegular>();
	}
	public void addPoligonoRegular(PoligonoRegular p){
		lista.add(p);
	}
	public List<PoligonoRegular> getLista() {
		return lista;
	}
	
	
}
