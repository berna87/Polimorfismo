package ejercicios;

public class TestPoligonoRegular {
	public static void main(String[] args) {
		PoligonoRegular p1 = new Cuadrado(5);
		PoligonoRegular p2 = new Cuadrado(7);
		PoligonoRegular p3 = new Cuadrado(6.5);
		PoligonoRegular p4 = new TrianguloEquilatero(5);
		PoligonoRegular p5 = new TrianguloEquilatero(6);
		PoligonoRegular p6 = new TrianguloEquilatero(7);
		PoligonoRegular p7 = new Hexagono(5);
		PoligonoRegular p8 = new Hexagono(7);
		PoligonoRegular p9 = new Hexagono(6.5);
		ListaPoligonoRegular lista = new ListaPoligonoRegular();
		lista.addPoligonoRegular(p1); lista.addPoligonoRegular(p2); lista.addPoligonoRegular(p3);
		lista.addPoligonoRegular(p4); lista.addPoligonoRegular(p5); lista.addPoligonoRegular(p6);
		lista.addPoligonoRegular(p7); lista.addPoligonoRegular(p8); lista.addPoligonoRegular(p9);
		for (PoligonoRegular p : lista.getLista()) {
			System.out.println(p + ", Perimetro: "+p.getPerimetro()+ ", Area: "+p.getArea());
		}
		
		for (PoligonoRegular p : lista.getLista()) {
			System.out.print(p.equals(p1)+"\t");
		}
		for (PoligonoRegular p : lista.getLista()) {
			System.out.print("\n"+p.compareTo(p1)+"\t");
		}
		
	}
}
