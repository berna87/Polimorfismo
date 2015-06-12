package ejercicios3;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo v1 = new Coche();
		Vehiculo v2 = new Motocicleta();
		
		System.out.println(v1.acelerar(100));
		System.out.println(v1.acelerar(50));
		System.out.println(v1.frenar(50));
		System.out.println(v2.acelerar(100));
		System.out.println(v2.acelerar(50));
		System.out.println(v2.frenar(50));
		
	}

}
