package diapositivas2;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		FigurasGeometricas f1 = new Cuadrado(5);
		FigurasGeometricas f2 = new Rectangulo(5,4);
		FigurasGeometricas f3 = new Circulo(2.5);
		System.out.println(f1+"\n"+f2+"\n"+f3);
		System.out.println(f1.getArea()+"\n"+f2.getArea()+"\n"+f3.getArea());

	}

}
